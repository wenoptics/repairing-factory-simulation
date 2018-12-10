package Components;

import java.util.ArrayList;

public class RepairingFactorySimulation extends Simulation<Integer> {

    private CustomerGenerator customerGenerator;
    private RepairingService repairingService;
    private PriorityCustomerQueue waitingQueue;

    /**
     * We still have to collect these customer for reporting/stats
     */
    private ArrayList<Customer> finishedCustomers;

    public RepairingFactorySimulation(CustomerGenerator customerGenerator) {
        this.customerGenerator = customerGenerator;
    }

    @Override
    protected void init() {
        finishedCustomers = new ArrayList<>();
        repairingService = new RepairingService();
        waitingQueue = new PriorityCustomerQueue();
    }

    @Override
    protected void doOneStep() {
        int accTime = this.currentTime - this.startTime;

        // Check how many customers' coming
        int nNewCustomer = customerGenerator.howMany(currentTime - lastTime);
        for (int i=0; i<nNewCustomer; i++) {
            Customer newCustomer = customerGenerator.generateOne();
            newCustomer.enteredRepairingShop(this.currentTime);

            // The customer got into the waiting line!
            waitingQueue.add(newCustomer);
        }

        // At each step, check if our mechanics are working on a customer
        if (repairingService.isBusy()) {
            // there's one customer been served right now
            // check if this one can be finish at this point
            Customer cstm = repairingService.finishingWithCurrent(currentTime);
            if (cstm != null) {
                finishedCustomers.add(cstm);

                // now we can serve a new customer
                tryToServeNextCustomer();
            }
        } else {
            // the mechanic has been waiting! serve a new customer now!
            tryToServeNextCustomer();
        }

        repairingService.tick(currentTime);

    }

    private void tryToServeNextCustomer() {
        // get the high priority customer from pq
        Customer nextHighPriorityCustomer = waitingQueue.getNextPrioritized();

        if (nextHighPriorityCustomer != null) {
            repairingService.serveOne(nextHighPriorityCustomer, currentTime);
        } else {
            // there's no customer in the waiting line!
        }
    }

    public void stats() {

    }

}

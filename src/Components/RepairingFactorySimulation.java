package Components;

import Util.Log;

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
        finishedCustomers = new ArrayList<Customer>();
        repairingService = new RepairingService();
        waitingQueue = new PriorityCustomerQueue();
    }

    @Override
    protected void doOneStep() {
        int accTime = this.currentTime - this.startTime;

        // Check how many customers' coming
        Integer nNewCustomer = customerGenerator.howMany(currentTime - lastTime);
        Log.info(String.format("nNewCustomer: %s", nNewCustomer.toString()));
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
            Customer cstm = repairingService.checkFinishingWithCurrent(currentTime);
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

        /*// can serve 3 customers / timeu
        int server_rate = 3;
        int served = 0;
        for ( int _i = 0; _i < server_rate; _i++ ) {
            if (tryToServeNextCustomer()) {
                served++;
            }
        }

        Log.info(String.format("mechanics have been occupied %.2f%% [%d/%d] of this hours",
                (double)served/server_rate*100, served, server_rate));*/

        Log.info(String.format("There're %d customer waiting on the line", waitingQueue.getLength()));
    }

    /**
     * @return if served
     */
    private boolean tryToServeNextCustomer() {
        // get the high priority customer from pq
        Customer nextHighPriorityCustomer = waitingQueue.getNextPrioritized();

        if (nextHighPriorityCustomer != null) {
            repairingService.serveOne(nextHighPriorityCustomer, currentTime);
            /*// intermediately finished!
            repairingService.finishCurrent(currentTime);*/
            return true;
        } else {
            // there's no customer in the waiting line!
            return false;
        }
    }

    public void stats() {
        Log.info("");
        Log.info("");
        Log.info("");
        Log.info("Statistics:");
        int total_customer_cost = 0;
        for (int i = 0; i < finishedCustomers.size(); i++) {
            total_customer_cost +=
                    finishedCustomers.get(i).timeRepairStarted - finishedCustomers.get(i).timeWaitStarted;
        }
        Log.info("Total costs for customers: $" + total_customer_cost * 10);
        Log.info(String.format("There are still %d customers still in the line:", waitingQueue.getLength()));


    }

}

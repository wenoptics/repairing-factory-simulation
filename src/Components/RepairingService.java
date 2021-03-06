package Components;

/**
 * RepairingService is actually a state-machine
 */
public class RepairingService {

    private enum RepairingServiceStates{
        IDLE,
        BUSY
    }

    /**
     * The customer that is serving
     */
    private Customer currentCustomer;
    private int startTime;
    private int ETAFinishTime;


    /**
     * Total time that the repairing service is idle. Keep for stats purpose
     */
    private int totalIdleTime = 0;
    private int lastIdleStart = 0;

    private RepairingServiceStates repairingServiceStates;

    public void serveOne(Customer customer, int startTime) {
        if (isBusy()) {
            throw new RuntimeException("The repairing factory is currently working on some customer, " +
                    "can't serve a new customer at this moment");
        }

        this.startTime = startTime;
        this.currentCustomer = customer;

        // How long do we take to finish
        this.ETAFinishTime = (int) (this.startTime + 4f/customer.vip_level);

        this.currentCustomer.notifyStartRepairing(startTime);
        this.repairingServiceStates = RepairingServiceStates.BUSY;
    }

    public void finishCurrent(int currentTime) {
        currentCustomer.notifyEndOfRepairing(currentTime);
        repairingServiceStates = RepairingServiceStates.IDLE;
    }

    public Customer checkFinishingWithCurrent(int currentTime) {
        if (isVacant()) {
            throw new RuntimeException("The repairing factory is currently NOT working on a customer");
        }

        if (currentTime > this.ETAFinishTime) {
            // we have done with this customer!
            finishCurrent(currentTime);
            return currentCustomer;
        } else {
            // the service still has to process the current
            // do nothing
            return null;
        }
    }

    /**
     * Keep track of stats
     * @param currentTime
     */
    public void tick(int currentTime) {
        if (isVacant()) {
            totalIdleTime += currentTime - lastIdleStart;
            lastIdleStart = currentTime;
        }
    }

    public int getTotalIdleTime() {
        return totalIdleTime;
    }

    public boolean isBusy() {
        return repairingServiceStates == RepairingServiceStates.BUSY;
    }
    public boolean isVacant () {
        return repairingServiceStates == RepairingServiceStates.IDLE;
    }
}

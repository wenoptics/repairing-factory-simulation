package Components;

public class Customer {
    public String name;
    public int vip_level;
    public int timeRepairStarted;
    public int timeRepairFinished;
    public int timeWaitStarted;

    /**
     * now start repairing!
     * @param nowTime the current timestamp
     */
    public void notifyStartRepairing(int nowTime) {
        timeRepairStarted = nowTime;
    }

    /**
     * Hey, your repair is finished
     * @param nowTime the current timestamp
     */
    public void notifyEndOfRepairing(int nowTime) {
        timeRepairFinished = nowTime;
    }

    /**
     * When customer enter the shop
     * @param nowTime the current timestamp
     */
    public void enteredRepairingShop(int nowTime) {
        timeWaitStarted = nowTime;
    }


}

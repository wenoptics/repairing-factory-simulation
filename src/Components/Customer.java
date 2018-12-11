package Components;

import Util.Log;

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
        Log.info(String.format("Customer (vip_level == %d) start repairing, after waited for %d hours, at t=%d!",
                vip_level, timeRepairStarted - timeWaitStarted, nowTime));
    }

    /**
     * Hey, your repair is finished
     * @param nowTime the current timestamp
     */
    public void notifyEndOfRepairing(int nowTime) {
        timeRepairFinished = nowTime;
        Log.info(String.format("Customer with vip_level == %d finish repairing at t=%d!", vip_level, nowTime));
    }

    /**
     * When customer enters the shop
     * @param nowTime the current timestamp
     */
    public void enteredRepairingShop(int nowTime) {
        timeWaitStarted = nowTime;
        Log.info(String.format("Customer with vip_level == %d entered Repairing Shop at t=%d", vip_level, nowTime));
    }


}

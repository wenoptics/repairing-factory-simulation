import Components.CustomerGenerator;
import Components.RepairingFactorySimulation;
import Util.Log;

public class Demo {

    public static void main(String[] args) {

        // Simulate customer enter the repairing shop with poisson-distribution
        CustomerGenerator customerGenerator = new CustomerGenerator(2);

        // Initialized our factory
        RepairingFactorySimulation repairingFactorySimulation = new RepairingFactorySimulation(customerGenerator);

        // Start the simulation and observe the simulation
        int startTime = 0, endTime = 50;
        repairingFactorySimulation.start(startTime);
        for (int nowTime = startTime; nowTime <= endTime; nowTime++) {

            Log.info("");
            Log.info(String.format("===================== nowTime: %d =====================", nowTime));

            repairingFactorySimulation.pumpTime(nowTime);
        }

        repairingFactorySimulation.stats();

    }
}

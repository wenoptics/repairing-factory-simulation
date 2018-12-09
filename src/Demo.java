import Components.CustomerGenerator;
import Components.RepairingFactorySimulation;

public class Demo {

    public static void main(String[] args) {

        // Simulate customer enter the repairing shop with poisson-distribution
        CustomerGenerator customerGenerator = new CustomerGenerator(2);

        RepairingFactorySimulation repairingFactorySimulation = new RepairingFactorySimulation(customerGenerator);

        int startTime = 0, endTime = 500;
        repairingFactorySimulation.start(startTime);
        for (int nowTime = startTime; nowTime <= endTime; nowTime++) {
            repairingFactorySimulation.pumpTime(nowTime);
        }

    }
}

package Components;

import Components.Math.DistributionModel;
import Components.Math.NormalDistributionModel;
import Components.Math.PoissonDistributionModel;

public class CustomerGenerator {

    private PoissonDistributionModel customerNumberGenerator;
    private DistributionModel<Double> vipLevelGenerator;
    private double poissonLambda;

    public boolean shouldGenerateNow(int e) {
        return true;
    }

    public CustomerGenerator(double poissonLambda) {
        this.poissonLambda = poissonLambda;
        customerNumberGenerator = new PoissonDistributionModel(poissonLambda);
        vipLevelGenerator = new NormalDistributionModel();
    }

    public Customer generateOne() {
        // generate a customer with vip_level according to normal distribution
        Customer c = new Customer();
        c.vip_level = vipLevelGenerator.getOne().intValue();
        return c;
    }
}

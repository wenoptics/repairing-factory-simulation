package Components;

import Components.Math.DistributionModel;
import Components.Math.NormalDistributionModel;

public class CustomerGenerator {

    private DistributionModel<Double> vipLevelGenerator;
    private double poissonLambda;

    // TODO: 12/9/2018 integrid with possibility math model
    public boolean shouldGenerateNow(int e) {
        return true;
    }

    public CustomerGenerator(double poissonLambda) {
        this.poissonLambda = poissonLambda;
        vipLevelGenerator = new NormalDistributionModel();
    }

    public Customer generateOne() {
        // generate a customer with vip_level according to normal distribution
        Customer c = new Customer();
        c.vip_level = vipLevelGenerator.getOne().intValue();
        return c;
    }
}

package Components;

import Components.Math.DistributionModel;
import Components.Math.InverseProportionalModel;
import Components.Math.NormalDistributionModel;
import Components.Math.PoissonDistributionModel;

public class CustomerGenerator {

    private PoissonDistributionModel customerNumberGenerator;
    private DistributionModel<Integer> vipLevelGenerator;
    private double poissonLambda;

    public Integer howMany(int timeFrame) {
        // TODO: 12/10/2018
        return customerNumberGenerator.getOne();
    }

    public CustomerGenerator(double poissonLambda) {
        this.poissonLambda = poissonLambda;
        customerNumberGenerator = new PoissonDistributionModel(poissonLambda);
        vipLevelGenerator = new InverseProportionalModel(5);
    }

    public Customer generateOne() {
        // generate a customer with vip_level according to normal distribution
        Customer c = new Customer();
        c.vip_level = vipLevelGenerator.getOne();
        return c;
    }
}

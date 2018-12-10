package Components.Math;

import java.util.Random;

public class NormalDistributionModel extends DistributionModel<Integer> {

    private final double mean;
    private final double std;

    public NormalDistributionModel(double mean, double std) {
        this.mean = mean;
        this.std = std;
    }

    public Integer getOne() {
        // FIXME: 12/9/2018
        Random random = new Random();
        return random.nextInt(10) + 1;
    }

}

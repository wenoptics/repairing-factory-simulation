package Components.Math;

public class NormalDistributionModel extends DistributionModel<Double> {

    private final double mean;
    private final double std;

    public NormalDistributionModel(double mean, double std) {

        this.mean = mean;
        this.std = std;
    }

    public Double getOne() {
        // FIXME: 12/9/2018
        return mean;
    }

}

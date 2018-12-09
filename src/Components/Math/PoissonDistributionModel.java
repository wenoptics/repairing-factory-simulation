package Components.Math;

public class PoissonDistributionModel extends DistributionModel<Double> {

    private double lambda;

    public PoissonDistributionModel(double lambda) {
        this.lambda = lambda;
    }

    @Override
    public Double getOne() {
        // FIXME: 12/9/2018
        return null;
    }
}

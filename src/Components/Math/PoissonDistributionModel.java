package Components.Math;

import java.util.Random;

public class PoissonDistributionModel extends DistributionModel<Integer> {

    private double mu;

    public PoissonDistributionModel(double mu) {
        this.mu = mu;
    }

    @Override
    public Integer getOne() {
        double y = 0;
        int k = 0;

        while (y <= 1) {
            Random random = new Random();
            float u = random.nextInt();
            double x = Math.exp(-mu * u);
            y = y + x;
            k = k + 1;
        }

        return k;
    }
}

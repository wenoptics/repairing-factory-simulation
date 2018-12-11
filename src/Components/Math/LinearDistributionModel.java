package Components.Math;

import java.util.Random;

public class LinearDistributionModel extends DistributionModel<Integer> {

    private final int k;
    private final int c;

    public LinearDistributionModel(int k, int c) {

        this.k = k;
        this.c = c;
    }

    @Override
    public Integer getOne() {
        Random random = new Random();
        return (k * random.nextInt(10) + c);
    }
}

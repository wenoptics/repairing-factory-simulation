package Components.Math;

import java.util.Random;

public class InverseProportionalModel extends DistributionModel<Integer> {

    private int k;

    public InverseProportionalModel(int k) {
        this.k = k;
    }

    @Override
    public Integer getOne() {
        Random random = new Random();
        return (int)(((double)k) / (random.nextInt(k)+1));
    }
}

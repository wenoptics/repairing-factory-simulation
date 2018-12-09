package Components;

public class CustomerGenerator {


    private double poissonLambda;

    // TODO: 12/9/2018 integrid with possibility math model
    public boolean shouldGenerateNow(int e) {
        return true;
    }

    public CustomerGenerator(double poissonLambda) {
        this.poissonLambda = poissonLambda;
    }

    public Customer generateOne() {

        return new Customer();
    }
}

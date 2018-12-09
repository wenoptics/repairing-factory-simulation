package Components;

public abstract class Simulation<TimeType> {
    public TimeType currentTime;
    public TimeType startTime;

    protected abstract void init();
    protected abstract void doOneStep();

    /**
     * Start the simulation
     */
    public void start(TimeType startTime) {
        this.startTime = startTime;
        this.init();
    }

    public void pumpTime(TimeType currentTime) {
        this.currentTime = currentTime;
        this.doOneStep();
    }
}

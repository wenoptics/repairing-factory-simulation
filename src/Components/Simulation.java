package Components;

public abstract class Simulation<TimeType> {
    public TimeType currentTime;
    public TimeType startTime;
    public TimeType lastTime;

    protected abstract void init();
    protected abstract void doOneStep();

    /**
     * Start the simulation
     */
    public void start(TimeType startTime) {
        this.startTime = startTime;
        this.currentTime = startTime;
        this.init();
    }

    public void pumpTime(TimeType currentTime) {
        this.lastTime = this.currentTime;
        this.currentTime = currentTime;
        this.doOneStep();
    }
}

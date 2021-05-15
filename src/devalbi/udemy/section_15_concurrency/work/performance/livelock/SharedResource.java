package devalbi.udemy.section_15_concurrency.work.performance.livelock;

/**
 * Created by timbuchalka on 2/08/2016.
 */
public class SharedResource {

    private Worker owner;

    public SharedResource(Worker owner) {
        this.owner = owner;
    }

    public Worker getOwner() {
        return owner;
    }

    public synchronized void setOwner(Worker owner) {
        this.owner = owner;
    }
}

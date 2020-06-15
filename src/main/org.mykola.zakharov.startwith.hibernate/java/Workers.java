import java.util.Set;

public class Workers {
    private long id;
    private Set<User> setOfWorkers;

    public Workers() {
    }

    public Workers(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Set<User> getSetOfWorkers() {
        return setOfWorkers;
    }

    public void setSetOfWorkers(Set<User> setOfWorkers) {
        this.setOfWorkers = setOfWorkers;
    }
}

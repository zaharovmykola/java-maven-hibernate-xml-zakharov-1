package org.mykola.zakharov.startwith.hibernate.entity;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name="Workers")
public class Workers extends AbstractEntity {
    @OneToMany(mappedBy = "workers")
    private Set<User> setOfWorkers = new HashSet<>(0);

    public Workers() {
    }

    public Set<User> getSetOfWorkers() {
        return setOfWorkers;
    }

    public void setSetOfWorkers(Set<User> setOfWorkers) {
        this.setOfWorkers = setOfWorkers;
    }

    @Override
    public String toString() {
        return "Workers{" +
                ", setOfWorkers=" + setOfWorkers +
                '}';
    }
}

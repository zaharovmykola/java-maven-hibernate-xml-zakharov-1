package org.mykola.zakharov.startwith.hibernate.entity;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name="Workers")
public class Workers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    @OneToMany(mappedBy = "workers")
    private Set<User> setOfWorkers = new HashSet<>(0);

    public Workers() {
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

    @Override
    public String toString() {
        return "Workers{" +
                ", setOfWorkers=" + setOfWorkers +
                '}';
    }
}

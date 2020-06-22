package org.mykola.zakharov.startwith.hibernate.entity;
import javax.persistence.*;

@Entity
@Table(name="Workers")
public class DreamJob extends AbstractEntity {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name="id")
//    private long id;
    @Column(name="name", length=25)
    private String name;
    @Column(name="field", length=25)
    private String field;
    @Column(name="salary")
    private Integer salary;
    @Column(name="country", length=25)
    private String country;
    @Column(name="city", length=25)
    private String city;

    public DreamJob() {
    }

//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "DreamJob{" +
                ", name='" + name + '\'' +
                ", field='" + field + '\'' +
                ", salary=" + salary +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

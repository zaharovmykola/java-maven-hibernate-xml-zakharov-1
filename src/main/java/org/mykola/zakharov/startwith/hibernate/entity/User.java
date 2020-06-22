package org.mykola.zakharov.startwith.hibernate.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Users")
public class User extends AbstractEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name="id")
//    private long id;
    @Column(name="age")
    private int age;
    @Column(name="first_name", length=25)
    private String firstName;
    @Column(name="last_name", length=25)
    private String lastName;
    @OneToOne
    @PrimaryKeyJoinColumn // это нужно указывать для одного из один-один
    private UserDetails userDetails;
    @ManyToOne(fetch = FetchType.LAZY) // выкачиватся данные будут только когда попросят
    @JoinColumn(name = "setOfWorkers")
    private Workers workers;
    @ManyToMany
    @JoinTable(name = "UserRoles") // название общей таблицы
    private Set<Role> setOfRoles = new HashSet<>(0);

    public User() {}

//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    public Workers getWorkers() {
        return workers;
    }

    public void setWorkers(Workers workers) {
        this.workers = workers;
    }

    public Set<Role> getSetOfRoles() {
        return setOfRoles;
    }

    public void setSetOfRoles(Set<Role> setOfRoles) {
        this.setOfRoles = setOfRoles;
    }

    @Override
    public String toString() {
        return "User{" +
                ", age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userDetails=" + userDetails +
                '}';
    }
}

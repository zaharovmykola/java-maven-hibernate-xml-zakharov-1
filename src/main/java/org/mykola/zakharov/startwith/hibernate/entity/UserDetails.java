package org.mykola.zakharov.startwith.hibernate.entity;

import javax.persistence.*;

@Entity
@Table(name="UsersDetails")
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    @Column(name="details", length=100)
    private String text;
    @OneToOne(mappedBy = "userDetails")
    private User user;

    public UserDetails() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "text='" + text + '\'' +
                '}';
    }
}

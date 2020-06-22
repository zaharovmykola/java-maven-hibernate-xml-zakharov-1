package org.mykola.zakharov.startwith.hibernate.entity;

import javax.persistence.*;

@Entity
@Table(name="UsersDetails")
public class UserDetails extends AbstractEntity {
    @Column(name="details", length=100)
    private String text;
    @OneToOne(mappedBy = "userDetails")
    private User user;

    public UserDetails() {
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

package org.mykola.zakharov.startwith.hibernate;
public class UserDetails {
    private long id;
    private String text;
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

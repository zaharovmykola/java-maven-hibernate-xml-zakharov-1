package org.mykola.zakharov.startwith.hibernate.entity;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Roles")
public class Role extends AbstractEntity {
    @Column(name="role_name", length=25)
    private String roleName;
    @ManyToMany(mappedBy = "setOfRoles")
    private Set<User> setOfUsers = new HashSet<>(0);

    public Role() {
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Set<User> getSetOfUsers() {
        return setOfUsers;
    }

    public void setSetOfUsers(Set<User> setOfUsers) {
        this.setOfUsers = setOfUsers;
    }

    @Override
    public String toString() {
        return "Role{" +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}

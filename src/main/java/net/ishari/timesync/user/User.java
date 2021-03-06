package net.ishari.timesync.user;

import net.ishari.timesync.usergroup.UserGroup;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    private String username;
    private String password;
    @Column(unique = true)
    private String email;
    @ManyToMany(mappedBy = "users")
    private List<UserGroup> userGroups = new ArrayList<>();

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public List<UserGroup> getUserGroups() {
        return userGroups;
    }
    public void setUserGroups(List<UserGroup> userGroups) {
        this.userGroups = userGroups;
    }
}

package com.exam.examserver.model;


import javax.persistence.*;

@Entity
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long UserRoleId;

//    Single User
    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

    @ManyToOne
    private Role role;

    public UserRole() {
    }

    public UserRole(Long userRoleId, User user, Role role) {
        UserRoleId = userRoleId;
        this.user = user;
        this.role = role;
    }


    public Long getUserRoleId() {
        return UserRoleId;
    }

    public void setUserRoleId(Long userRoleId) {
        UserRoleId = userRoleId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}

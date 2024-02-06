package com.softwarearchitecture.groupproject.entity;
import jakarta.persistence.*;

// This is a POJO class for user
@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue
    private int userId;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String email;

    @Column
    private String phone;

    @Column
    private String password;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

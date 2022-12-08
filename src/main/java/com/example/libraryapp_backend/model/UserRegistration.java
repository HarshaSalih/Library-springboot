package com.example.libraryapp_backend.model;

import jakarta.persistence.*;

@Entity
@Table(name="UserRegistration")

public class UserRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String name;
    private String aadharNo;
    private String address;
    private int pincode;
    private String dob;
    private String email;
    private String phone;
    private String userName;
    private String password;
    private String confirmPassword;

    public UserRegistration() {
    }

    public UserRegistration(int id, String name, String aadharNo, String address, int pincode, String dob, String email, String phone, String userName, String password, String confirmPassword) {
        this.id = id;
        this.name = name;
        this.aadharNo = aadharNo;
        this.address = address;
        this.pincode = pincode;
        this.dob = dob;
        this.email = email;
        this.phone = phone;
        this.userName = userName;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAadharNo() {
        return aadharNo;
    }

    public void setAadharNo(String aadharNo) {
        this.aadharNo = aadharNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}

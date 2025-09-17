package com.priyanshi.oneToOneMapping.entity;

import jakarta.persistence.*;

@Table(name="user_details")
@Entity
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String phone;

    @OneToOne(cascade={CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REMOVE})
    @JoinColumn(name="address_id",referencedColumnName="id")
    private UserAddress userAddress;

    public UserDetails() {
    }

    public UserDetails(Long id, String name, String phone, UserAddress userAddress) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.userAddress = userAddress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public UserAddress getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(UserAddress userAddress) {
        this.userAddress = userAddress;
    }
}


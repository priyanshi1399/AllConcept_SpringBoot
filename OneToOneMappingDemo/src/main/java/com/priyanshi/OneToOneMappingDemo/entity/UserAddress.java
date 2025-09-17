package com.priyanshi.OneToOneMappingDemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="user_address")
public class UserAddress {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Long id;
    private String street;
    public String city;
    private String state;
    private String country;
    private String pincode;

    public UserAddress() {
    }

    public UserAddress(Long id, String street, String city, String state, String country, String pincode) {
        this.id = id;
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
    }
}

package com.priyanshi.oneToOneMapping.entity;

import jakarta.persistence.*;

@Entity
@Table(name="user_address")
public class UserAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;
    private String city;
    private String state;
    private String country;
    private String pinCode;

    public UserAddress() {
    }

    public UserAddress(Long id, String street, String city, String state, String country, String pinCode) {
        this.id = id;
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pinCode = pinCode;
    }
}

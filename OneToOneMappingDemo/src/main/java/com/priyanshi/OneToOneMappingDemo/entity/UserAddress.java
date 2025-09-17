package com.priyanshi.OneToOneMappingDemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="user_address")
public class UserAddress {

    /* commenting uncomment it in case of primary only one ky
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    */
    @EmbeddedId
    private UserAddressCK id;
    //private Long id; //uncomment it in case of one primarykey
    //private String street;
    public String city;
    private String state;
    private String country;
   // private String pinCode;

    public UserAddress() {
    }
    /*

    public UserAddress(Long id, String street, String city, String state, String country, String pinCode) {
        this.id = id;
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pinCode = pinCode;
    }*/

    public UserAddress(UserAddressCK id, String city, String state, String country) {
        this.id = id;
        this.city = city;
        this.state = state;
        this.country = country;

    }

    public UserAddressCK getId() {
        return id;
    }

    public void setId(UserAddressCK id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

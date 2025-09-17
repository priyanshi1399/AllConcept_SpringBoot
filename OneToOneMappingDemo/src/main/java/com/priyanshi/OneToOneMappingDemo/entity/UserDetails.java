package com.priyanshi.OneToOneMappingDemo.entity;

import jakarta.persistence.*;

@Table(name="user_details")
@Entity
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String phone;

   @OneToOne(cascade=CascadeType.ALL)
    //@JoinColumn(name="address_id",referencedColumnName = "id")
   @JoinColumns({
           @JoinColumn(name="address_street" ,referencedColumnName = "street"),
           @JoinColumn(name="address_pin_code",referencedColumnName = "pinCode")
   })
    private UserAddress userAddress;

    public UserDetails() {
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

package com.priyanshi.DynamicNativeQuery.entity;

import com.priyanshi.DynamicNativeQuery.entity.UserAddress;
import jakarta.persistence.*;

@Entity
@Table(name = "user_details")
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name", nullable = false)
    private String userName;

    @Column(nullable = false)
    private String phone;

    // Foreign Key to UserAddress
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_address_id", referencedColumnName = "id")
    private UserAddress userAddress;

    // Getters and Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
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

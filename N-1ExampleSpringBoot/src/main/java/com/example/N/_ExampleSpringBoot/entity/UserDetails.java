package com.example.N._ExampleSpringBoot.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.BatchSize;

import java.util.ArrayList;
import java.util.List;

@Table(name="user_details")
@Entity
public class UserDetails {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long userId;

    @Column(name="user_name")
    private String name;
    private String phone;

    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    @BatchSize(size=10)
    @JoinColumn(name="user_id")
    private List<UserAddress> userAddressList=new ArrayList<>();

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    public List<UserAddress> getUserAddressList() {
        return userAddressList;
    }

    public void setUserAddressList(List<UserAddress> userAddressList) {
        this.userAddressList = userAddressList;
    }
}

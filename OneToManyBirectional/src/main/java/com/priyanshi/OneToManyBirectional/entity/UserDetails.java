package com.priyanshi.OneToManyBirectional.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Table(name="user_details")
@Entity
@JsonIdentityInfo(
        generator= ObjectIdGenerators.PropertyGenerator.class,
        property="userId"
)
public class UserDetails {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long userId;
    private String name;
    private String phone;
    @OneToMany(mappedBy="userDetails",cascade = CascadeType.ALL)
    private List<OrderDetails> orderDetails=new ArrayList<>();

    public UserDetails() {
    }

    public UserDetails(Long userId, String name, String phone, List<OrderDetails> orderDetails) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
        this.orderDetails = orderDetails;
    }

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

    public List<OrderDetails> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetails> orderDetails) {
        this.orderDetails = orderDetails;
        for(OrderDetails order:orderDetails){
            order.setUserDetails(this);
        }
    }
}

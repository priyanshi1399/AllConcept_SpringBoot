package com.priyanshi.oneToOneMapping.DTO;

import com.priyanshi.oneToOneMapping.entity.UserDetails;

public class UserDetailsDTO {

    private Long id;
    private String name;
    private String phone;
    private String address;

    //constructor to populate from UserDetails Entity
    public UserDetailsDTO(UserDetails userDetails) {
        this.id = userDetails.getId();
        this.name = userDetails.getName();
        this.phone = userDetails.getPhone();
        System.out.println("going to query user address here now");
        this.address = userDetails.getUserAddress()!=null?userDetails.getUserAddress().getStreet():null;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

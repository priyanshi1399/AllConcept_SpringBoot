package com.priyanshi.JPQLExample.DTO;

public class UserDTO {
    String userName;
    String country;

    public UserDTO(String userName,String country){
        this.userName=userName;
        this.country=country;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

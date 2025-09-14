package com.priyanshi.SpringbootMapDTO.entity;

import java.io.Serializable;
import java.util.Objects;

public class UserDetailsCK implements Serializable {

    private String name;
    private String address;

    public UserDetailsCK(){

    }

    @Override
    public int hashCode() {
        return Objects.hash(name,address);
    }

    @Override
    public boolean equals(Object obj) {
       if(this==obj){
           return true;
       }
       if(!(obj instanceof UserDetailsCK)){
           return false;
       }
       UserDetailsCK userCK=(UserDetailsCK) obj;
       return this.name.equals(userCK.name) && this.address.equals(userCK.address);
    }
}

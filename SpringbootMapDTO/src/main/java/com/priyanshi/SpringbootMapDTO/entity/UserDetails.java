package com.priyanshi.SpringbootMapDTO.entity;

import jakarta.persistence.*;

@Table(name="USER_DETAILS",schema="ONBOARDING",
uniqueConstraints={@UniqueConstraint(columnNames="phone"),
@UniqueConstraint(columnNames={"name","email"})
},
indexes={
        @Index(name="index_phone",columnList="phone"),
        @Index(name="index_name_email",columnList="name,email")
})
//@IdClass(UserDetailsCK.class)
@Entity
public class UserDetails {

   @Id
   @GeneratedValue(strategy= GenerationType.SEQUENCE,generator = "unique_user_seq")
   @SequenceGenerator(name = "unique_user_seq",sequenceName = "db-seq-name",initialValue = 100,allocationSize = 5)
    private Long Id;
    @Column(name="full_name",unique=true,nullable=false,length=255)
    //@Id
    private String name;
    private String email;
    private String phone;
    private String address;
    public UserDetails() {
    }

    public UserDetails(Long id, String name, String email, String phone,String address) {
        Id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address=address;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

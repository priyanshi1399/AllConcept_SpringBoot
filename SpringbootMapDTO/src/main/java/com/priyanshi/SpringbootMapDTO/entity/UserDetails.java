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
@Entity
public class UserDetails {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long Id;
    @Column(name="full_name",unique=true,nullable=false,length=255)
    private String name;
    private String email;
    private String phone;

    public UserDetails() {
    }

    public UserDetails(Long id, String name, String email, String phone) {
        Id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
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
}

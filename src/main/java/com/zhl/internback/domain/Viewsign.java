package com.zhl.internback.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;
import javax.persistence.Id;

@Entity
@Data
@Table(name = "sign")
public class Viewsign {
    @Id
    @Column(name = "Id")
    private Integer Id;
    @Column(name = "Name")
    private String Name;
    @Column(name = "Classnamess")
    private String Classnamess;
    @Column(name = "Company")
    private String Company;
    @Column(name = "Password")
    private String Password;
    @Column(name = "stu_num")
    private Integer stu_num;
    @Column(name = "time")
    private Timestamp time;
    @Column(name = "sign_address")
    private String sign_address;
    @Column(name = "Address")
    private String Address;

    public Viewsign() {
    }

    public Viewsign(Integer id, String name, String classnamess, String company, String password, Integer stu_num, Timestamp time, String sign_address, String address) {
        Id = id;
        Name = name;
        Classnamess = classnamess;
        Company = company;
        Password = password;
        this.stu_num = stu_num;
        this.time = time;
        this.sign_address = sign_address;
        Address = address;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getClassnamess() {
        return Classnamess;
    }

    public void setClassnamess(String Classnamess) {
        this.Classnamess = Classnamess;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String Company) {
        this.Company = Company;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public Integer getStu_num() {
        return stu_num;
    }

    public void setStu_num(Integer stu_num) {
        this.stu_num = stu_num;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public String getSign_address() {
        return sign_address;
    }

    public void setSign_address(String sign_address) {
        this.sign_address = sign_address;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
}

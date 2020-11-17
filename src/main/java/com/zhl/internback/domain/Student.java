package com.zhl.internback.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Student {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String Name;
    @Id
    private Integer Stunum;
    private String Classnamess;
    private String Company;
    private String Password;


    public Student() {
        super();
    }

    public Student(Integer id, String name, Integer stunum, String classnamess, String company, String password) {
        super();
        this.Id = id;
        this.Name = name;
        this.Stunum = stunum;
        this.Classnamess = classnamess;
        this.Company = company;
        this.Password = password;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Integer getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Integer getStunum() {
        return this.Stunum;
    }

    public void setStunum(Integer Stunum) {
        this.Stunum = Stunum;
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

//    @Override
//    public String toString(){
//        return "Address [Id=" + Id + ", Name=" + Name + ", Stunum=" + Stunum + ", Classnamess="
//                + Classnamess + ", Company=" + Company + ", Password=" + Password + "]";
//    }
}

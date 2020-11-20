package com.zhl.internback.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Student {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String Name;
    @Id
    private Integer stunum;
    private String Classnamess;
    private String Company;
    private String password;


    public Student() {
        super();
    }

    public Student(Integer id, String name, Integer stunum, String classnamess, String company, String password) {
        super();
        this.Id = id;
        this.Name = name;
        this.stunum = stunum;
        this.Classnamess = classnamess;
        this.Company = company;
        this.password = password;
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
        return stunum;
    }

    public void setStunum(Integer stunum) {
        this.stunum = stunum;
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
        return password;
    }

    public void setPassword(String Password) {
        this.password = Password;
    }

//    @Override
//    public String toString(){
//        return "Address [Id=" + Id + ", Name=" + Name + ", Stunum=" + Stunum + ", Classnamess="
//                + Classnamess + ", Company=" + Company + ", Password=" + Password + "]";
//    }
}

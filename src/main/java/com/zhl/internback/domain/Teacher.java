package com.zhl.internback.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Teacher {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int Id;
    @Id
    int Tec_num;
    String Name;
    String Classnamess;
    String Password;

    public Teacher() {
    }

    public Teacher(int id, int tec_num, String name, String classnamess, String password) {
        Id = id;
        Tec_num = tec_num;
        Name = name;
        Classnamess = classnamess;
        Password = password;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getTec_num() {
        return Tec_num;
    }

    public void setTec_num(int Tec_num) {
        this.Tec_num = Tec_num;
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

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
}

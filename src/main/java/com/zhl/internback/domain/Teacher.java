package com.zhl.internback.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Teacher {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int Id;
    @Id
    int tecnum;
    String Name;
    String Classnamess;
    String password;

    public Teacher() {
    }

    public Teacher(int id, int tec_num, String name, String classnamess, String password) {
        Id = id;
        tecnum = tec_num;
        Name = name;
        Classnamess = classnamess;
        password = password;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getTecnum() {
        return tecnum;
    }

    public void setTecnum(int Tec_num) {
        this.tecnum = Tec_num;
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
        return password;
    }

    public void setPassword(String Password) {
        this.password = Password;
    }
}

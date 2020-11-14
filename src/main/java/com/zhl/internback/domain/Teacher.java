package com.zhl.internback.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Teacher {
    int Id;
    @Id
    int Tec_num;
    String Name;
    String Class_Name;

    public Teacher() {
    }


}

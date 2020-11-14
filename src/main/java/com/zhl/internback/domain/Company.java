package com.zhl.internback.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Company {
    int Id;
    @Id
    int Com_num;
    String Name;
    String Address;
    String Principal;
}

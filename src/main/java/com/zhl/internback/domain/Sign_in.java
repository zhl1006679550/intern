package com.zhl.internback.domain;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.*;

@Entity
@Data
public class Sign_in implements Serializable {
    private static final long serialVersionUID = 8283950216116626180L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int stu_num;
    Timestamp time;
    String sign_address;

    public Sign_in() {
    }

    public Sign_in(int id, int stu_num, Timestamp time, String sign_address) {
        this.id = id;
        this.stu_num = stu_num;
        this.time = time;
        this.sign_address = sign_address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStu_num() {
        return stu_num;
    }

    public void setStu_num(int stu_num) {
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

    @Override
    public String toString(){
        return String.format("Sign_in [id=%d,stu_num=%d,time=%s,sign_address=%s]",id,stu_num,time,sign_address);
    }
}

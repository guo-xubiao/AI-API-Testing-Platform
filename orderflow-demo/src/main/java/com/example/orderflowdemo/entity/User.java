package com.example.orderflowdemo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {
    @Id
    private Long id;
    private String username;
    private String email;
    private String phone;
    private String address;
    private int role;
    private int status;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    public User(){}

    public User(Long id, String username, String email, String phone, String address, int role, int status,
            LocalDateTime createTime, LocalDateTime updateTime) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.role = role;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
}

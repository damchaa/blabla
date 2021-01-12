package com.example.app.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    private Long id;
    private String login;
    private String password;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role roleId;

}
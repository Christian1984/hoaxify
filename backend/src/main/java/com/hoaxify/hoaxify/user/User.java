package com.hoaxify.hoaxify.user;

import lombok.Data;
import lombok.Generated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String displayName;
    private String password;
}

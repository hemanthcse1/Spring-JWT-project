package com.hemanth.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user_table")
public class Users {

    @Id
    private int id;
    private String phoneNumber;
    private String emailId;
    private String firstName;
    private String lastName;
}

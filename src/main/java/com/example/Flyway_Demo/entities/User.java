package com.example.Flyway_Demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Table(name = "REGISTRANTION_TABLE")

public class User {
    @Id
    @GeneratedValue
    private Long id ;

    private  String username;
    private String first_name;
    private  String last_name;
    private String email;
    private  String phone;
}

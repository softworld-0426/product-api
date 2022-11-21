package com.co.solsys.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "account")
public class Account {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private double balance;
    private String status;
}
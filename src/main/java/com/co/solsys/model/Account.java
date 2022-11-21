package com.co.solsys.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "accounts")
public class Account {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private double balance;
    @Size(max = 1)
    private String status;
    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    private List<Subscription> subscriptions;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "billingAddress_id")
    private BillingAddress billingAddress;
    //@OneToOne(mappedBy = "account", cascade = CascadeType.ALL)
    //private BillingAddress billingAddress;
}
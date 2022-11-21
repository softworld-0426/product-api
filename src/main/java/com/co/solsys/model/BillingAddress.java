package com.co.solsys.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "billing")
public class BillingAddress {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String address1;
    private String address2;
    private String postalCode;
    private String providence;

    @OneToOne(mappedBy = "billingAddress")
    private Account account;
}

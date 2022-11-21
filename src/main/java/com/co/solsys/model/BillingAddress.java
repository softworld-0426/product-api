package com.co.solsys.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

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

    //@OneToOne(mappedBy = "billingAddress", cascade = CascadeType.ALL)
    //@OneToOne
    //private Account account;
    @OneToOne(mappedBy = "billingAddress")
    private Account account;
}

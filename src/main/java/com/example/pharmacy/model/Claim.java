
package com.example.pharmacy.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
public class Claim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private Patient patient;

    @Embedded
    private Insurance insurance;

    private String pharmacyId;
    private String claimType;
    private BigDecimal claimCost;
    private String status;

    // getters and setters
}


package com.example.pharmacy.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Insurance {
    private String provider;
    private String policyNumber;

    // getters and setters
}

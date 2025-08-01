
package com.example.pharmacy.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Patient {
    private String name;
    private String customerId;

    // getters and setters
}

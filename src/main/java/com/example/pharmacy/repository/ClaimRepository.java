
package com.example.pharmacy.repository;

import com.example.pharmacy.model.Claim;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClaimRepository extends JpaRepository<Claim, Long> {
}

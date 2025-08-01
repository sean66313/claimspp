
package com.example.pharmacy.service;

import com.example.pharmacy.model.Claim;
import com.example.pharmacy.repository.ClaimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClaimService {

    @Autowired
    private ClaimRepository claimRepository;

    public Claim processClaim(Claim claim) {
        claim.setStatus("PROCESSED");
        return claimRepository.save(claim);
    }

    public List<Claim> getAllClaims() {
        return claimRepository.findAll();
    }
}

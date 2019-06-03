package com.bank.loan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.loan.beans.DocumentRequirement;

@Repository
public interface DocumentRequirementRepo extends JpaRepository<DocumentRequirement, Long>{

}

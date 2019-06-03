package com.bank.loan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.loan.beans.CreditDecision;

@Repository
public interface CreditDecisionRepo extends JpaRepository<CreditDecision, Long>{

	
}

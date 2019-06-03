package com.bank.loan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.loan.beans.LoanInfo;

@Repository
public interface LoanInfoRepo extends JpaRepository<LoanInfo, Long>{

}

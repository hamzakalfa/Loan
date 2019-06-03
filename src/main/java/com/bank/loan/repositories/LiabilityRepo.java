package com.bank.loan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.loan.beans.Liability;

@Repository
public interface LiabilityRepo extends JpaRepository<Liability, Long>{

}

package com.bank.loan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.loan.beans.EmploymentInfo;

@Repository
public interface EmploymentInfoRepo extends JpaRepository<EmploymentInfo, Long>{

}

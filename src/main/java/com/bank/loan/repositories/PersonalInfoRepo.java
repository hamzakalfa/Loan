package com.bank.loan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.loan.beans.PersonalInfo;

@Repository
public interface PersonalInfoRepo extends JpaRepository<PersonalInfo, Long>{

	
}

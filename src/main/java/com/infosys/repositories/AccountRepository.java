package com.infosys.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infosys.models.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

}

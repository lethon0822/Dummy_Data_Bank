package com.creators.youbank_dummy.application;

import com.creators.youbank_dummy.entity.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {

}

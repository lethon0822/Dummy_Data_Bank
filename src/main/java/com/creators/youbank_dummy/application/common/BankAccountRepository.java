package com.creators.youbank_dummy.application.common;

import com.creators.youbank_dummy.entity.common.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {

}

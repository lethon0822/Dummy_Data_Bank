package com.creators.youbank_dummy.application.common;

import com.creators.youbank_dummy.entity.common.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
package com.creators.youbank_dummy.application;

import com.creators.youbank_dummy.entity.InsurePolicy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsurePolicyRepository extends JpaRepository<InsurePolicy,String> {
}

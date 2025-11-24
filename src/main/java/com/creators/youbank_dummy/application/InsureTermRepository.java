package com.creators.youbank_dummy.application;

import com.creators.youbank_dummy.entity.InsureTerm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsureTermRepository extends JpaRepository<InsureTerm, String> {
}

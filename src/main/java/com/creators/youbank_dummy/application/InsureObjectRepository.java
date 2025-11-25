package com.creators.youbank_dummy.application;

import com.creators.youbank_dummy.entity.InsureObject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsureObjectRepository extends JpaRepository<InsureObject,String> {
}

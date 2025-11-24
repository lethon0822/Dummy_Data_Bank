package com.creators.youbank_dummy.application;

import com.creators.youbank_dummy.entity.InsureProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsureProductRepository extends JpaRepository<InsureProduct, String> {

}

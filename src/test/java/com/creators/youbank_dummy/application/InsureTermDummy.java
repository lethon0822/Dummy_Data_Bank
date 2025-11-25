package com.creators.youbank_dummy.application;

import com.creators.youbank_dummy.Dummy;
import com.creators.youbank_dummy.entity.InsureProduct;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class InsureTermDummy extends Dummy {
    @Autowired
    private InsureProductRepository insureProductRepository;
    @Autowired
    private InsureTermRepository insureTermRepository;

    private List<InsureProduct> insureProductList;
    void BeforeAll() {
        insureProductList = insureProductRepository.findAll();
        System.out.println("insureProductList.size(): " + insureProductList);
    }

}

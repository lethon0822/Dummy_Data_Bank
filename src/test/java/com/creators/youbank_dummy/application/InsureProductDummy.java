package com.creators.youbank_dummy.application;

import com.creators.youbank_dummy.Dummy;
import com.creators.youbank_dummy.entity.InsureProduct;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class InsureProductDummy extends Dummy {
    @Autowired InsureProductRepository insureProductRepository;

    @Test
    @Rollback(false)
    void insertProducts() {
        final int SIZE = 30;

        for (int i = 0; i < SIZE; i++) {
            InsureProduct p = generateProduct();
            insureProductRepository.save(p);
            System.out.println(p);
        }
        insureProductRepository.flush();
    }

    private static final String[] PREFIX = {
            "스마트", "프리미엄", "안심", "플러스", "케어", "헬스", "파워", "골드", "365", "퍼펙트", "엘리트", "베스트"
    };

    private static final String[] TARGET = {
            "암", "건강", "화재", "노후", "연금", "종합", "사망", "생존", "실손", "자동차", "간병"
    };

    private static final String[] TYPE = {
            "보험", "보장", "플랜"
    };

    private static int productIdCounter = 1;
    private String generateProductId() {
        // "P" + 5자리 숫자 형식으로 반환
        String id = String.format("P%05d", productIdCounter);
        productIdCounter++; // 다음 제품을 위해 증가
        return id;
    }

    private String generateInsuranceName() {
        return PREFIX[faker.random().nextInt(PREFIX.length)] + " " +
                TARGET[faker.random().nextInt(TARGET.length)] + TYPE[faker.random().nextInt(TYPE.length)];
    }

    private InsureProduct generateProduct() {
        String productName = generateInsuranceName(); // 랜덤 보험 이름 생성
        int category;
        if (productName.contains("사망") || productName.contains("연금") || productName.contains("생존")|| productName.contains("노후")){
            category = 1;
        } else if (productName.contains("화재") || productName.contains("자동차")) {
            category = 2;
        } else if (productName.contains("실손") || productName.contains("암") || productName.contains("건강") || productName.contains("간병")) {
            category = 3;
        } else {
            category = 4;
        }

        return InsureProduct.builder()
                .productId(generateProductId())
                .category(faker.number().numberBetween(1, 4))
                .productName(productName)
                .build();
    }

}

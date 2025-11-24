package com.creators.youbank_dummy.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "TB_INSURE_PRODUCT")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InsureProduct {
    @Id
    @Column(name = "PRODUCT_ID", length = 10, nullable = false)
    private String productId;

    @Column(name = "CATEGORY", nullable = false)
    private Integer category;

    @Column(name = "PRODUCT_NM", length = 30, nullable = false, unique = true)
    private String productName;
}
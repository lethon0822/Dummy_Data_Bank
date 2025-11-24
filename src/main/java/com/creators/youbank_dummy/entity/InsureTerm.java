package com.creators.youbank_dummy.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "TB_INSURE_TERM")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InsureTerm {

    @Id
    @Column(name = "PRODUCT_TERM_ID", length = 10, nullable = false)
    private String productTermId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_ID", nullable = false)
    private InsureProduct product;

    @Column(name = "TERM_TYPE", nullable = false)
    private Integer termType;

    @Column(name = "TERM_TITLE", length = 30, nullable = false)
    private String termTitle;

    @Column(name = "TERM_CONTENT", columnDefinition = "TEXT", nullable = false)
    private String termContent;

    @Column(name = "DESIGNATED_DATE", nullable = false)
    private LocalDate designatedDate;

    @Column(name = "MODIFY_DATE")
    private LocalDate modifyDate;
}
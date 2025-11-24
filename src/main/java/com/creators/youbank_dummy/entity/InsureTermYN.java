package com.creators.youbank_dummy.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "TB_INSURE_TERM_YN")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@IdClass(InsureTermYNId.class)
public class InsureTermYN {
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_TERM_ID", nullable = false)
    private InsureTerm term;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "POLICY_ID", nullable = false)
    private InsurePolicy policy;

    @Column(name = "TERM_YN", length = 1)
    private String termYn;
}
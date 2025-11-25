package com.creators.youbank_dummy.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "TB_INSURE_PAY")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@IdClass(InsurePayId.class)
public class InsurePay {

    @Id
    @Column(name = "PAY_DATE", nullable = false)
    private LocalDate payDate;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "POLICY_ID", nullable = false)
    private InsurePolicy policy;

    @Column(name = "PAY_AMOUNT", nullable = false)
    private Integer payAmount;
}
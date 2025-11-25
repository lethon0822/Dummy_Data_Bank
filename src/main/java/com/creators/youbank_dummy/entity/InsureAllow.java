package com.creators.youbank_dummy.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "TB_INSURE_ALLOW")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@IdClass(InsureAllowId.class)
public class InsureAllow {

    @Id
    @Column(name = "ALLOW_DATE", nullable = false)
    private LocalDate allowDate;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "POLICY_ID", nullable = false)
    private InsurePolicy policy;

    @Column(name = "ALLOW_REASON", length = 100, nullable = false)
    private String allowReason;

    @Column(name = "ALLOW_AMOUNT")
    private Integer allowAmount;

    @Column(name = "ALLOW_YN", length = 1, nullable = false)
    private String allowYn;
}
package com.creators.youbank_dummy.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "TB_INSURE_CANCEL")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@IdClass(InsureCancelId.class)
public class InsureCancel {

    @Id
    @Column(name = "CANCEL_ID", length = 10, nullable = false)
    private String cancelId;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "POLICY_ID", nullable = false)
    private InsurePolicy policy;

    @Column(name = "SURRENDAR_VALUE", nullable = false)
    private Integer surrenderValue;

    @Column(name = "CANCEL_DATE", nullable = false)
    private LocalDate cancelDate;

    @Column(name = "REASON", columnDefinition = "TEXT", nullable = false)
    private String reason;
}

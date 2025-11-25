package com.creators.youbank_dummy.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "TB_INSURE_OBJECT")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InsureObject {

    @Id
    @Column(name = "INSURER_OBJECT_ID", length = 10, nullable = false)
    private String insurerObjectId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "POLICY_ID", nullable = false)
    private InsurePolicy policy;

    @Column(name = "TYPE", nullable = false)
    private Integer type;

    @Column(name = "SHARE_RATIO")
    private Integer shareRatio;
}
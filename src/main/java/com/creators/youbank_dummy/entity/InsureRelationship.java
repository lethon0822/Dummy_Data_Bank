package com.creators.youbank_dummy.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "TB_INSURE_RELATIONSHIP")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@IdClass(InsureRelationshipId.class)
public class InsureRelationship {

    @Id
    @Column(name = "RELATIONSHIP_ID", length = 10, nullable = false)
    private String relationshipId;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "POLICY_ID", nullable = false)
    private InsurePolicy policy;

    @Column(name = "INSURE_NM", length = 20, nullable = false)
    private String insureNm;

    @Column(name = "INSURE_GUBUN", nullable = false)
    private Integer insureGubun;

    @Column(name = "RELATIONSHIP", length = 10, nullable = false)
    private String relationship;
}
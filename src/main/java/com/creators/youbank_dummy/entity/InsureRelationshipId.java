package com.creators.youbank_dummy.entity;

import java.io.Serializable;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InsureRelationshipId implements Serializable  {
    private String relationshipId;
    private String policy;
}
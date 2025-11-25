package com.creators.youbank_dummy.entity;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InsureCancelId implements Serializable {
    private String cancelId;
    private String policy;
}

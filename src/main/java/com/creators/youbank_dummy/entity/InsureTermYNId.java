package com.creators.youbank_dummy.entity;

import lombok.EqualsAndHashCode;
import java.io.Serializable;

@EqualsAndHashCode
public class InsureTermYNId implements Serializable {
    private InsureTerm term;
    private InsurePolicy policy;
}

package com.creators.youbank_dummy.entity;

import java.io.Serializable;
import java.time.LocalDate;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InsureAllowId implements Serializable  {
    private LocalDate allowDate;
    private String policy;
}
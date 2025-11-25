package com.creators.youbank_dummy.entity;

import lombok.*;
import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InsurePayId implements Serializable {
    private LocalDate payDate;
    private String policy;  // 엔티티에서는 ManyToOne이지만 IdClass에서는 타입이 PK 타입이어야 함
}
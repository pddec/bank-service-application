package com.application.service.bank.model;

import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Wallet {
    BigDecimal amount;
}

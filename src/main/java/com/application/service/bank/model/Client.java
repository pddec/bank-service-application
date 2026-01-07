package com.application.service.bank.model;

import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Client {
    String id;
    String name;
    String Address;
    String phoneNumber;
    LocalDate birthDate;
    Wallet wallet;
    Passport passport;
}

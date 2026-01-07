
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
public class Passport {

    String code;
    String name;
    String surname;
    LocalDate birthDate;
    LocalDate validFrom;
    LocalDate validTo;
}

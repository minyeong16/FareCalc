package com.example.calc.dto;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HolidayRequest {

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private LocalDate holidayDate;

    private String holidayName;

    private String regionCode;

    private String memo;

}

package com.example.calc.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.time.LocalDate;

@Entity
@Table(name = "HOLIDAY")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Holiday {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "HOLIDAY_DATE", nullable = false)
    private LocalDate holidayDate;

    @Column(name = "HOLIDAY_NAME", length = 50, nullable = false)
    private String holidayName;

    @Column(name = "REGION_CODE", length = 20)
    private String regionCode;

    @Column(name = "MEMO", length = 100)
    private String memo;

    @Column(name = "CREATED_DATE")
    private Timestamp createdDate;

}

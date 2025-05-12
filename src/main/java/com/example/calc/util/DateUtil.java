package com.example.calc.util;

import org.springframework.cglib.core.Local;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

public class DateUtil {
    /**
     * 해당 월의 출근한 날짜 계산
     */
    public static List<LocalDate> getWorkDays(int year, int month, List<LocalDate> leaveDays) {

        List<LocalDate> workdays = new ArrayList<>();

        YearMonth yearMonth = YearMonth.of(year, month);

        // 평일 날짜 구하기
        for(int i = 1; i < yearMonth.lengthOfMonth(); i++) {
            LocalDate date = LocalDate.of(year, month, i);
            DayOfWeek dayOfWeek = date.getDayOfWeek();

            // 주말, 연차 제외
            if(dayOfWeek != DayOfWeek.SATURDAY && dayOfWeek != DayOfWeek.SUNDAY && !leaveDays.contains(date)) {
                workdays.add(date);
            }
        }

        return workdays;

    }
}

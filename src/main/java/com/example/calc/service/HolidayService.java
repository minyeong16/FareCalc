package com.example.calc.service;

import com.example.calc.dto.HolidayRequest;
import com.example.calc.entity.Holiday;
import com.example.calc.repository.HolidayRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class HolidayService {

    private final HolidayRepository repository;

    public HolidayService(HolidayRepository repository) {
        this.repository = repository;
    }

    public void createHoliday(HolidayRequest request) {
        Holiday holiday = Holiday.builder()
                            .holidayName(request.getHolidayName())
                            .holidayDate(request.getHolidayDate())
                            .regionCode(request.getRegionCode())
                            .memo(request.getMemo())
                            .build();

        Holiday saveData = repository.save(holiday);
        log.info("[HolidayService] createHoliday save data : " + saveData.getId());
    }
}

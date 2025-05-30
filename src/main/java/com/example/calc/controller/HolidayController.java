package com.example.calc.controller;

import com.example.calc.dto.HolidayRequest;
import com.example.calc.service.HolidayService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolidayController {

    private final HolidayService service;

    public HolidayController(HolidayService service) {
        this.service = service;
    }

    @PostMapping("/holidays")
    public void createHoliday(@RequestBody HolidayRequest request) {
        service.createHoliday(request);
    }
}

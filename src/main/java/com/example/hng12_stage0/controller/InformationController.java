package com.example.hng12_stage0.controller;

import com.example.hng12_stage0.service.InformationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("api/")
@RequiredArgsConstructor
public class InformationController {
    private final InformationService informationService;

    @GetMapping("getInfo")
    public Map<String, String> getInformation() {
        return informationService.getInformation();
    }
}

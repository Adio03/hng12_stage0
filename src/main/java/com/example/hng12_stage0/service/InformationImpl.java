package com.example.hng12_stage0.service;

import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.Map;
@Service
public class InformationImpl implements InformationService {
    @Override
    public Map<String, String> getInformation() {
        Map<String, String> response = new LinkedHashMap<>();
        response.put("email", "adioldmj@gmail.com");
        response.put("current_datetime", Instant.now().atOffset(ZoneOffset.UTC).truncatedTo(java.time.temporal.ChronoUnit.SECONDS).format(DateTimeFormatter.ISO_INSTANT));
        response.put("github_url", "https://github.com/Adio03/hng12_stage0.git");

        return response;
    }
}

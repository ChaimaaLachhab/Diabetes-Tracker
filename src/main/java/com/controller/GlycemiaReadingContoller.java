package com.controller;

import com.model.GlycemiaReading;
import com.services.GlycemiaReadingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@Controller
@RequestMapping("/")
public class GlycemiaReadingContoller {

    private final GlycemiaReadingService service;

    public GlycemiaReadingContoller(GlycemiaReadingService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/registration-list")
    public String getAllReadings(Model model) {
        List<GlycemiaReading> readings = service.getAllReadings();
        Map<LocalDate, Float> readingMap = generateReadingsMap(readings, 7);
        model.addAttribute("readingMap", readingMap);
        return "registration-list";
    }

    @GetMapping("/add")
    public String addReadingForm(Model model) {
        model.addAttribute("reading", new GlycemiaReading());
        return "add-reading-form";
    }

    @PostMapping("/add")
    public String addReadingSubmit(@ModelAttribute GlycemiaReading reading) {
        service.addReading(reading);
        return "redirect:/registration-list";
    }

    @GetMapping("/delete/{id}")
    public String deleteReading(@PathVariable long id) {
        service.deleteReading(id);
        return "redirect:/registration-list";
    }

    private Map<LocalDate, Float> generateReadingsMap(List<GlycemiaReading> readings, int days) {
        LocalDate today = LocalDate.now();
        LocalDate startDate = today.minusDays(days - 1);
        List<LocalDate> dates = Stream.iterate(startDate, date -> date.plusDays(1))
                .limit(days)
                .collect(Collectors.toList());

        Map<LocalDate, Float> readingMap = new LinkedHashMap<>();
        for (LocalDate date : dates) {
            readingMap.put(date, null);
        }

        for (GlycemiaReading reading : readings) {
            if (reading != null && reading.getDate() != null && readingMap.containsKey(reading.getDate())) {
                readingMap.put(reading.getDate(), reading.getLevel());
            }
        }

        return readingMap;
    }

}
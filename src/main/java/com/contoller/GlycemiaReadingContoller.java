package com.contoller;

import com.model.GlycemiaReading;
import com.services.GlycemiaReadingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("")
public class GlycemiaReadingContoller {

    private final GlycemiaReadingService service;

    public GlycemiaReadingContoller(GlycemiaReadingService service) {
        this.service = service;
    }

    @GetMapping("/add")
    public String addReadingForm(Model model) {
        model.addAttribute("reading", new GlycemiaReading());
        return "add-reading-form";
    }

    @PostMapping
    public String addReadingSubmit(@ModelAttribute GlycemiaReading reading) {
        service.addReading(reading);
        return "index";
    }

    @GetMapping("/delete/{id}")
    public String deleteReading(@PathVariable long id) {
        service.deleteReading(id);
        return "";
    }

    @GetMapping
    public String getAllReadings() {
        List<GlycemiaReading> readings = service.getAllReadings();
        return "";
    }

}

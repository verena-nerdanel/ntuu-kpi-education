package org.vg.db_university.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.vg.db_university.dto.ScholarshipStatDto;
import org.vg.db_university.repositories.ScholarshipRepository;

import java.util.List;

@Controller
@RequestMapping("/scholarship")
public class ScholarshipController {

    @Autowired
    private ScholarshipRepository scholarshipRepository;

    @GetMapping("/statistics")
    public String getStatistics(Model model) {
        List<ScholarshipStatDto> statistics = scholarshipRepository.getStatistics();

        model.addAttribute("statistics", statistics);

        return "scholarship_stats";
    }
}


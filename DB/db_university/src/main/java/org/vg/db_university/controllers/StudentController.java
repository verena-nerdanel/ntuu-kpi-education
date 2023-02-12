package org.vg.db_university.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.vg.db_university.entities.StudentEntity;
import org.vg.db_university.repositories.StudentRepository;

@Controller
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

//    @GetMapping("/students")
//    public String findStudent(@RequestParam(name = "id") int id, Model model) {
//        StudentEntity student = studentRepository.findById(id).get();
//
//        model.addAttribute("name", student.getName());
//
//        return "student";
//    }

    @GetMapping("/students")
    public String findStudents(Model model) {
        Iterable<StudentEntity> students = studentRepository.findAll();

        model.addAttribute("students", students);

        return "students";
    }
}


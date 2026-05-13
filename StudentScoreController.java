package spring_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring_demo.model.StudentScore;
import spring_demo.service.StudentScoreService;

import java.util.List;

@RestController
//@RequestMapping("/school")
public class StudentScoreController {

    @Autowired
    private StudentScoreService service;

    @PostMapping("/add")
    public StudentScore addScore(@RequestBody StudentScore score) {
        return service.addStudentScore(score);
    }

    @GetMapping("/all")
    public List<StudentScore> getAllScores() {
        return service.getAllScores();
    }
}


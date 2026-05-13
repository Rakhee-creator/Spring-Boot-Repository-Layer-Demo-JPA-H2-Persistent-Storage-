package spring_demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring_demo.model.StudentScore;
import spring_demo.repository.StudentScoreRepository;

import java.util.List;

@Service
public class StudentScoreService {

    @Autowired
    private StudentScoreRepository repository;

    public StudentScore addStudentScore(StudentScore score) {
        return repository.save(score);
    }

    public List<StudentScore> getAllScores() {
        return repository.findAll();
    }
}


package spring_demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_scores")
public class StudentScore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String studentName;
    private int mathMarks;
    private int scienceMarks;
    private int englishMarks;
    // getters and setters
    public int getEnglishMarks() {return englishMarks;}
    public int getScienceMarks() {return scienceMarks;}
    public String getStudentName() {return studentName;}
    public int getMathMarks() {return mathMarks;}
    public Long getId() {return id;}

    public void setEnglishMarks(int englishMarks) {this.englishMarks = englishMarks;}
    public void setScienceMarks(int scienceMarks) {this.scienceMarks = scienceMarks;}
    public void setStudentName(String studentName) {this.studentName = studentName;}
    public void setMathMarks(int mathMarks) {this.mathMarks = mathMarks;}
    public void setId(Long id) {this.id = id;}
}



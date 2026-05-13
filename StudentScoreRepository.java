
package spring_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring_demo.model.StudentScore;

public interface StudentScoreRepository extends JpaRepository<StudentScore, Long> {
}

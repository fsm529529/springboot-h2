package jeeno.example.springbooth2.repository;

import jeeno.example.springbooth2.pojo.StudentDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * @Author: Du Jiahao
 * @Date: 2019/8/6 0006 21:49
 */
@Component
public interface StudentRepository extends JpaRepository<StudentDO, Long> {
}

package jeeno.example.springbooth2.controller;

import jeeno.example.springbooth2.pojo.CourseDO;
import jeeno.example.springbooth2.pojo.StudentDO;
import jeeno.example.springbooth2.repository.CourseRepository;
import jeeno.example.springbooth2.repository.StudentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * @Author: Du Jiahao
 * @Date: 2019/8/6 0006 21:48
 */
@RestController
public class MyController {

    @Resource
    private StudentRepository studentRepository;

    @Resource
    private CourseRepository courseRepository;

    @GetMapping("/student/list")
    public List<StudentDO> getAllStudents() {
        return studentRepository.findAll();
    }

    @GetMapping("/course/list")
    public List<CourseDO> getAllCourses() {
        return courseRepository.findAll();
    }

    @GetMapping("/student/delete/{id}")
    public void deleteStudentById(@PathVariable("id") String id) {
        studentRepository.deleteById(Long.valueOf(id));
    }

    @GetMapping("/student/update/{id}")
    public void updateStudent(@PathVariable("id") String id) {
        Optional<StudentDO> optional = studentRepository.findById(Long.valueOf(id));
        StudentDO studentDO = optional.get();
        if (studentDO != null) {
            studentDO.setAge(1000);
            studentRepository.save(studentDO);
        }

    }

}

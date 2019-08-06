package jeeno.example.springbooth2.controller;

import jeeno.example.springbooth2.pojo.CourseDO;
import jeeno.example.springbooth2.pojo.StudentDO;
import jeeno.example.springbooth2.repository.CourseRepository;
import jeeno.example.springbooth2.repository.StudentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Du Jiahao
 * @Date: 2019/8/6 0006 21:48
 */
@RestController
@RequestMapping("")
public class MyController {

    @Resource
    private StudentRepository studentRepository;

    @Resource
    private CourseRepository courseRepository;

    @GetMapping("/student/list")
    public List<StudentDO> getAllStudents(){
        return studentRepository.findAll();
    }

    @GetMapping("/course/list")
    public List<CourseDO> getAllCourses(){
        return courseRepository.findAll();
    }

}

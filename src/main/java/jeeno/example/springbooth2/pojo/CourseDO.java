package jeeno.example.springbooth2.pojo;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author: Du Jiahao
 * @Date: 2019/8/6 0006 21:39
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Table(name = "course")
public class CourseDO {
    @Id
    private Long id;
    @Column(name = "course_name")
    private String course;
    private String classroom;

}

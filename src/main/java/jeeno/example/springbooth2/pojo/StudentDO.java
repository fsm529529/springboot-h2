package jeeno.example.springbooth2.pojo;

import lombok.*;

import javax.persistence.*;

/**
 * @Author: Du Jiahao
 * @Date: 2019/8/6 0006 21:35
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Table(name = "student")
public class StudentDO {

    @Id
    private Integer id;
    @Column(name = "no")
    private String stuNo;
    private String name;
    private Integer age;
    /**
     * gender, 0-girl;1-boy
     */
    private Byte gender;
}

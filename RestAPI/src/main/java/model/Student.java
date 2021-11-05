package model;

import javax.persistence.*;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = " student")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column(name = "FULLNAME", nullable = false)
    private String name;
    @Column(name = "BIRTHDAY", nullable = false)
    private Date birthday;
    @Column(name = "CLASSNAME", nullable = false)
    private String classname;
    @Column(name = "MAJOR", nullable = false)
    private String major;
    @Column(name = "HOMETOWN", nullable = false)
    private String hometown;
    @Column(name = "GENDER", nullable = false)
    private String gender;
    @Column(name = "MARK", nullable = false)
    private int mark;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", classname='" + classname + '\'' +
                ", major='" + major + '\'' +
                ", hometown='" + hometown + '\'' +
                ", gender='" + gender + '\'' +
                ", mark=" + mark +
                '}';
    }
}

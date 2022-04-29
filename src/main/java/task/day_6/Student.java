package task.day_6;

import javax.persistence.Entity;
import javax.persistence.Id;

import java.util.Date;

@Entity
public class Student {
    //CREATE TABLE `aqa_it_step_4AT_2022`.`student` (
    //                                                  `id_student` INT NOT NULL AUTO_INCREMENT,
    //                                                  `name` VARCHAR(100) NOT NULL,
    //                                                  `size` VARCHAR(4) NULL,
    //                                                  `bd` DATETIME NULL,
    //                                                  PRIMARY KEY (`id_student`));

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_student;
    private String name;
    private String size;
    private Date bd;

    public Long getId_student() {
        return id_student;
    }

    public void setId_student(Long id_student) {
        this.id_student = id_student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Date getBd() {
        return bd;
    }

    public void setBd(Date bd) {
        this.bd = bd;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id_student=" + id_student +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", bd=" + bd +
                '}';
    }
}

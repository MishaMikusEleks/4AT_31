package task.day_7_8.model;


import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class RelatedStudent {
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

   // private Long id_address;

    @OneToMany(mappedBy = "idphone")
    public Set<Phone> phoneSet;

    @MapsId
    @OneToOne
    @JoinColumn(name="id_address")
    private RelatedAddress relatedAddress;

    public Set<Phone> getPhoneSet() {
        return phoneSet;
    }

    public void setPhoneSet(Set<Phone> phoneSet) {
        this.phoneSet = phoneSet;
    }

    //    public Long getId_address() {
//        return id_address;
//    }
//
//    public void setId_address(Long id_address) {
//        this.id_address = id_address;
//    }

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
        return "RelatedStudent{" +
                "id_student=" + id_student +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", bd=" + bd +
                ", phoneSet=" + phoneSet +
                ", relatedAddress=" + relatedAddress +
                '}';
    }
}

package task.day_6;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
    //CREATE TABLE `aqa_it_step_4AT_2022`.`address` (
    //                                                  `id_address` INT NOT NULL AUTO_INCREMENT,
    //                                                  `city` VARCHAR(45) NULL,
    //                                                  `street` VARCHAR(45) NULL,
    //                                                  `building` INT NULL,
    //                                                  PRIMARY KEY (`id_address`));
@Id
//@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_address;
    private String city;
    private String street;
    private Integer building;

    public Long getId_address() {
        return id_address;
    }

    public void setId_address(Long id_address) {
        this.id_address = id_address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getBuilding() {
        return building;
    }

    public void setBuilding(Integer building) {
        this.building = building;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id_address=" + id_address +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", building=" + building +
                '}';
    }
}

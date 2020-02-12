package spring.hibernate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Cars")
@Data
@AllArgsConstructor
public class Cars {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "employees_id", nullable = false, referencedColumnName="id")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    public Employees employees;

    @Column(name = "name")
    private String name;

    @Column(name = "model")
    private String model;

    @Column(name = "registration_date")
    @ToString.Exclude
    private Date registrationDate;

    public Cars() {}

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public Employees getEmployees() {
//        return employees;
//    }
//
//    public void setEmployees(Employees employees) {
//        this.employees = employees;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public Date getRegistrationDate() {
//        return registrationDate;
//    }
//
//    public void setRegistrationDate(Date registrationDate) {
//        this.registrationDate = registrationDate;
//    }
}

package spring.hibernate;

import lombok.*;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "Employees", uniqueConstraints = {
        @UniqueConstraint(columnNames = "id")})
@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Employees{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "last_name")
    @Getter@Setter
    @NonNull
    private String lastName;

    @Column(name = "first_name")
    @Getter@Setter
    @NonNull
    private String firstName;

    @Column(name = "address")
    @Getter@Setter
    @NonNull
    private String address;

    @Column(name = "city")
    @Getter@Setter
    @NonNull
    private String city;

    @Column(name = "salary")
    @Getter@Setter
    @NonNull
    private int salary;

    @Column(name = "age")
    @Getter@Setter
    @NonNull
    private int age;

    @Column(name = "start_job_date")
    @Getter@Setter
    @NonNull
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date startJobDate;

    @Column(name = "benefit")
    @Getter@Setter
    @NonNull
    private int benefit;

    @Column(name = "email")
    @Getter@Setter
    private String email;

    @OneToMany(mappedBy = "employees", orphanRemoval = true, fetch = FetchType.EAGER)
    @ToString.Exclude
    @Getter@Setter
    @EqualsAndHashCode.Exclude
    private Set<Cars> cars;

    @OneToMany(mappedBy = "employees", orphanRemoval = true, fetch = FetchType.EAGER)
    @ToString.Exclude
    @Getter@Setter
    @EqualsAndHashCode.Exclude
    private Set<Phones> phones;

//    @OneToMany(mappedBy = "employees", orphanRemoval = true, fetch = FetchType.EAGER)


//    @ManyToMany(mappedBy = "employees")
//    @ToString.Exclude
//    @EqualsAndHashCode.Exclude
//    private Set<Printer> printers;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(name="Employees_Printers",
                joinColumns={@JoinColumn(referencedColumnName="id")}
            , inverseJoinColumns={@JoinColumn(referencedColumnName="id")})
    @ToString.Exclude
    @LazyCollection(LazyCollectionOption.TRUE)
    @Getter@Setter
    @EqualsAndHashCode.Exclude
    Set<Printer> printers = new HashSet<>();

    public Employees(){}

//    public Employees(@NonNull String lastName, @NonNull String firstName, @NonNull String address, @NonNull String city, @NonNull int salary, @NonNull int age, @NonNull Date startJobDate, @NonNull int benefit) {
//        this.lastName = lastName;
//        this.firstName = firstName;
//        this.address = address;
//        this.city = city;
//        this.salary = salary;
//        this.age = age;
//        this.startJobDate = startJobDate;
//        this.benefit = benefit;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public int getSalary() {
//        return salary;
//    }
//
//    public void setSalary(int salary) {
//        this.salary = salary;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public Date getStartJobDate() {
//        return startJobDate;
//    }
//
//    public void setStartJobDate(Date startJobDate) {
//        this.startJobDate = startJobDate;
//    }
//
//    public int getBenefit() {
//        return benefit;
//    }
//
//    public void setBenefit(int benefit) {
//        this.benefit = benefit;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public Set<Cars> getCars() {
//        return cars;
//    }
//
//    public void setCars(Set<Cars> cars) {
//        this.cars = cars;
//    }
//
//    public Set<Phones> getPhones() {
//        return phones;
//    }
//
//    public void setPhones(Set<Phones> phones) {
//        this.phones = phones;
//    }
//
//    public Set<Printer> getPrinters() {
//        return printers;
//    }
//
//    public void setPrinters(Set<Printer> printers) {
//        this.printers = printers;
//    }
}

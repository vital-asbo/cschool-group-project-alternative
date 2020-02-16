package spring.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class DataHardCoder implements CommandLineRunner {

    @Autowired
    private CarsRepository carsRepository;
    @Autowired
    private EmployeesRepository employeesRepository;

    @Override
    public void run(String... args) {
        Employees employees = new Employees();
        employees.setFirstName("Jan");
        employees.setLastName("Nowak");
        employees.setAge(19);
        employees.setBenefit(1);
        employees.setCity("Warszawa");
        employees.setSalary(9000);
        employees.setAddress("Złota");
        employees.setStartJobDate(new Date());
        employees.setEmail("jan.nowak@gmail.com");

        employeesRepository.save(employees);

        Cars cars = new Cars();
        cars.setEmployees(employees);
        cars.setModel("500c");
        cars.setName("Fiat");

        carsRepository.save(cars);

        System.out.println("Showing employees: ");
        System.out.println(employeesRepository.findAll());

        System.out.println("Showing cars: ");
        System.out.println(carsRepository.findAll());
    }
}

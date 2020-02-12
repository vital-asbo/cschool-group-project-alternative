package spring.hibernate;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeesRepository extends JpaRepository<Employees, Integer> {
}

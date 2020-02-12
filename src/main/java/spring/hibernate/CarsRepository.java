package spring.hibernate;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CarsRepository extends JpaRepository<Cars, Integer> {
}

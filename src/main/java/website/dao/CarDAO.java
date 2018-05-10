package website.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import website.entity.Car;

public interface CarDAO extends JpaRepository<Car, Integer> {
}

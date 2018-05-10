package website.service.car;

import website.entity.Car;

import java.util.List;

public interface CarService {
    void saveCar(Car car);
    List<Car> findAll();
    Car findOne(int id);
}

package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDAO {

//    List<Car> showCars();
    List<Car> showCars(Integer count);
}

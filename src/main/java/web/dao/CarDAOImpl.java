package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAOImpl implements CarDAO {

    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("Audi", "A6", 190));
        carList.add(new Car("BMW", "X5", 249));
        carList.add(new Car("Porsche", "Panamera", 550));
        carList.add(new Car("Mercedes-Benz", "E-Class", 197));
        carList.add(new Car("Volkswagen", "Touareg", 249));
    }

    @Override
    public List<Car> showCars(Integer count) {
        if (count == null || count > carList.size()) {
            return carList;
        } else {
            return carList.stream().limit(count).toList();
        }
    }
}

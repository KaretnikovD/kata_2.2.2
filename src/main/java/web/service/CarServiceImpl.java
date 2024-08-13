package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Mercedes", "gray", 8));
        cars.add(new Car("BMV", "black", 12));
        cars.add(new Car("Audi", "white", 8));
        cars.add(new Car("Tesla", "blue", 8));
        cars.add(new Car("Porsche", "green", 12));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
package web.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarDaoImp implements CarDao {

    @Autowired
    @Override
    public List<Car> listCars() {

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("toyota", "camry", 2));
        cars.add(new Car("mazda", "7", 3));
        cars.add(new Car("subaru", "forester", 1));
        cars.add(new Car("lexus", "rx", 3));
        cars.add(new Car("nissan", "skiline", 5));

        return cars;
    }
}
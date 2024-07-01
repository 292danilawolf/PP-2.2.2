package web.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImp;
import web.model.Car;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {

    @Autowired
    private CarDao cardao;

    @Override
    public List<Car> listCars(int count) {

        List<Car> carslist = cardao.listCars();

        if (count <= carslist.size() && count >= 0) {
            return carslist.stream()
                    .limit(count)
                    .collect(Collectors.toList());
        }

        return carslist;
    }
}
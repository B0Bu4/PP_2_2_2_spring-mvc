package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService{


    @Override
    public List<Car> getCar(List<Car> cars, Integer count) {

        if (count == null || count >= cars.size()) {
            return cars;
        } else if(count > 0 && count < cars.size()) {
           return new ArrayList<Car>(cars.subList(0, count));
        }
        return null;
    }

}

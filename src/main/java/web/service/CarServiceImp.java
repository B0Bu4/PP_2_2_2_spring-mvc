package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService{

    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Mercedes-Benz", "Red", "H321KK99"));
        carList.add(new Car("Volga", "White", "M041AP50"));
        carList.add(new Car("Hyundai", "Silver", "X876YK197"));
        carList.add(new Car("Chevrolet", "Black", "C335TT177"));
        carList.add(new Car("BMW", "Blue", "A111MP77"));
    }

    @Override
    public List<Car> getCar(Integer count) {

        if (count == null || count >= carList.size()) {
            return carList;
        } else if(count > 0 && count < carList.size()) {
           return new ArrayList<>(carList.subList(0, count));
        }
        return null;
    }

}

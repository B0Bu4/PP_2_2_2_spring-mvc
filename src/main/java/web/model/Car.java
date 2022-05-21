package web.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Car {

    private String model;
    private String color;
    private String registerNumber;

    public String getModel() {
        return model;
    }

    public Car(){}

    public Car(String model, String color, String registerNumber) {
        this.model = model;
        this.color = color;
        this.registerNumber = registerNumber;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", registerNumber='" + registerNumber + '\'' +
                '}';
    }
}


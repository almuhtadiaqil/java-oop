package app;

import annotation.Fancy;
import data.Suzuki;

@Fancy(name="CarApp", tags = {"Application", "Java"})
public class CarApp {
    public static void main(String[] args) {

        var car = new Suzuki();
        car.drive();
        System.out.println(car.getTire());
    }
}

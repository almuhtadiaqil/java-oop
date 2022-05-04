package app;

import static data.Application.*;
import static data.Constant.*;
import data.Country;
import util.MathUtil;

public class StaticApp {

    public static void main(String[] args) {
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(MathUtil.sum(1,2,3,4,5,6));

        Country.City city = new Country.City();
        city.setName("Bandung");

        System.out.println(city.getName());

        System.out.println(PROCESSORS);
    }
}

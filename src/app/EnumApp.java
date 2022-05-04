package app;

import data.Customer;
import data.Level;

public class EnumApp {
    public static void main(String[] args) {

        Customer customer = new Customer();

        customer.setName("Aqil");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());

        String levelName = Level.VIP.name();
        System.out.println(levelName);

        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);

        Level[] levels = Level.values();
        System.out.println("Print Levels");
        for (var value : levels){
            System.out.println(value);
        }
    }
}

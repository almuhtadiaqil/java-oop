package app;

import data.*;

public class AbstractMethodApp {
    public static void main(String[] args) {
        Animal animal = new Cat();

        animal.name = "Puss";
        animal.run();
    }
}

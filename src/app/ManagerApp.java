package app;

import data.Manager;
import data.VicePresident;

public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("Ujang");
        manager.sayHello("Budi");

        var vp = new VicePresident("Aqil");
        vp.sayHello("Budi");
    }
}

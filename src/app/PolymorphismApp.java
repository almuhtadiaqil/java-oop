package app;

import data.Employee;
import data.Manager;
import data.VicePresident;

public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Ujang");
        employee.sayHello("Budi");

        employee = new Manager("Benjang");
        employee.sayHello("udi");

        employee = new VicePresident("Aqil");
        employee.sayHello("Budi");

        sayHello(new Employee("Ujang"));
        sayHello(new Manager("Benjang"));
        sayHello(new VicePresident("Ahmad"));
    }

    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello model.Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}

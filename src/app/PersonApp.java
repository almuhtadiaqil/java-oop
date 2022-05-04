package app;

import data.Person;

public class PersonApp {
    public static void main(String[] args) {
        var person = new Person("Muhammad Aqil", "Bandung");

        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.country);
        person.sayHello("Ujang");

        Person person2 = new Person("Mamat");
        Person person3 = new Person();
    }
}

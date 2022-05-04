package data;

public class Manager extends Employee {
    public String company;

    public Manager(String name) {
        super(name);
    }

    public Manager(String name, String company) {
        super(name);
        this.company = company;
    }

    public void sayHello(String name) {
        System.out.println("Hi " + name + ", My name is model.Manager" + this.name);
    }
}

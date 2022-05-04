package data;

public class Person {
    public String name;
    public String address;
    public final String country = "Indonesia";

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Person(String name){
        this(name,null);
    }

    public Person(){
        this(null);
    }

    public void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", My Name is " + name);
    }
}

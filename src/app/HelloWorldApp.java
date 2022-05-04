package app;

import data.HelloWorld;

public class HelloWorldApp {
    public static void main(String[] args) {
        HelloWorld english = new HelloWorld() {
            public void sayHello() {
                System.out.println("Hellwo");
            }

            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };
    }
}

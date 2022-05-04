package app;

public class EqualsApp {
    public static void main(String[] args) {

        String first = "Aqil";
        first = first + " " + "Almuhtadi";

        System.out.println(first);

        String second = "Aqil Almuhtadi";
        System.out.println(second);

        System.out.println(first == second);
        System.out.println(first.equals(second));
    }
}

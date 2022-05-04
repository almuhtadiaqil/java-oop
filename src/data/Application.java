package data;

public class Application {

    public static final int PROCESSORS;
    static {
        System.out.println("Mengakses Class Application");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}

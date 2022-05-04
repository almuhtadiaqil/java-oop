package data;

public class Bus implements Car{
    @Override
    public void drive() {
        System.out.println("Bus drive");
    }

    @Override
    public int getTire() {
        return 8;
    }

    @Override
    public String getBrand() {
        return "Hino";
    }

    @Override
    public boolean isMaintenance() {
        return false;
    }
}

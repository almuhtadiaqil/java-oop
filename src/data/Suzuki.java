package data;

public class Suzuki implements Car{
    public String getBrand(){
        return "Suzuki";
    }
    public void drive(){
        System.out.println("Drive Suzuki");
    }
    public int getTire(){
        return 4;
    }

    public boolean isMaintenance(){
        return false;
    }

    public boolean isBig() {
        return false;
    }
}

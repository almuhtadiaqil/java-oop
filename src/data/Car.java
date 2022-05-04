package data;

import annotation.Fancy;

@Fancy(name="Car", tags = {"Application", "Java"})

public interface Car extends HasBrand, IsMaintenance{
    void drive();
    int getTire();

    default boolean isBig(){
        return false;
    }
}

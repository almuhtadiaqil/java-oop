package app;

import data.Rectangle;

public class ShapeApp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        System.out.println(rectangle.getCorner());
        System.out.println(rectangle.getParentCorner());
    }
}

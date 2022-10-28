package creational_design_pattern.fectory;

import java.util.Objects;

public class Factory {

    Shape getShape(ShapeEnum shape){
        switch (shape){
            case Square -> {
                return new Square();
            }
            case Circle -> {
                return new Circle();
            }
            default -> {
                return null;
            }
        }
    }
}

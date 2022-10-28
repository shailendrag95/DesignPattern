package creational_design_pattern.abstract_factory;

public class ShapeFactory extends AbstractFactory{

    Shape getShape(ShapeEnum shape){
        switch (shape){
            case Square -> {
                return new Square();
            }
            case Rectangle -> {
                return new Rectangle();
            }
            default -> {
                return null;
            }
        }
    }
}

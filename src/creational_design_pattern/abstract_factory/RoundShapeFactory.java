package creational_design_pattern.abstract_factory;

public class RoundShapeFactory extends AbstractFactory{

    @Override
    public Shape getShape(ShapeEnum shape){
        switch (shape){
            case Circle -> {
                return new Circle();
            }
            default -> {
                return null;
            }
        }
    }
}

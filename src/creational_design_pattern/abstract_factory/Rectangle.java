package creational_design_pattern.abstract_factory;

public class Rectangle implements Shape {

    @Override
    public void printShape(){
        System.out.println(ShapeEnum.Rectangle.name());
    }
}

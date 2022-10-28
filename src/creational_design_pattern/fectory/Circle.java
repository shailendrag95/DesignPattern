package creational_design_pattern.fectory;

public class Circle implements Shape{
    @Override
    public void printShape() {
        System.out.println(ShapeEnum.Circle.name());
    }
}

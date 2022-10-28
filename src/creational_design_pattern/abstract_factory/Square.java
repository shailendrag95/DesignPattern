package creational_design_pattern.abstract_factory;

public class Square implements Shape {

    @Override
    public void printShape(){
        System.out.println(ShapeEnum.Square.name());
    }
}

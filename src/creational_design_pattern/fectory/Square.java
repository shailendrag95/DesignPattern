package creational_design_pattern.fectory;

public class Square implements Shape{

    @Override
    public void printShape(){
        System.out.println(ShapeEnum.Square.name());
    }
}

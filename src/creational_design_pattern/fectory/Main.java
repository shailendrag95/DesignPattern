package creational_design_pattern.fectory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
         Shape shape = factory.getShape(ShapeEnum.Square);
         shape.printShape();
    }
}

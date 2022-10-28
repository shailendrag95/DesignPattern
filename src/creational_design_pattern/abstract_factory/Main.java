package creational_design_pattern.abstract_factory;

public class Main {
    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
         Shape shape = shapeFactory.getShape(ShapeEnum.Square);
         shape.printShape();

        AbstractFactory shapeFactory2 = FactoryProducer.getFactory(false);
        Shape shape1 = shapeFactory2.getShape(ShapeEnum.Rectangle);
        shape1.printShape();

        AbstractFactory shapeFactory3 = FactoryProducer.getFactory(true);
        Shape shape3 = shapeFactory3.getShape(ShapeEnum.Circle);
        shape3.printShape();

        Shape shape4 = shapeFactory3.getShape(ShapeEnum.Square);
        shape4.printShape();
    }
}

package abstractFactory;

// this Factory generator/producer will get the factories you need based on if you want a filled or simple shape

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean filled){
        if (filled){
            return new FilledShapeFactory();
        } else {
            return new ShapeFactory();
        }
    }
}

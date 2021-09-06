package abstractFactory;
// also known as the main
public class AbstractFactoryPatternDemo {
    public static void main(String[] args){
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        Shape s1 = shapeFactory.getShape("CIRCLE");
        s1.draw();
        Shape s2 = shapeFactory.getShape("RECTANGLE");
        s2.draw();

        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
        Shape s3 = shapeFactory1.getShape("RECTANGLE");
        s3.draw();
        Shape s4 = shapeFactory1.getShape("CIRCLE");
        s4.draw();
    }
    
}

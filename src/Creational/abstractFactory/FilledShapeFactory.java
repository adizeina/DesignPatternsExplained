package abstractFactory;

public class FilledShapeFactory extends AbstractFactory {
    @Override 
    public Shape getShape(String shapeType){
        if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new FilledRectangle();
        } else if (shapeType.equalsIgnoreCase("CIRCLE")){
            return new FilledCircle();
        }
        return null;
    }
}
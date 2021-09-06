package abstractFactory;

public class FilledRectangle implements Shape{
    @Override 
    public void draw(){
        System.out.println("Inside FilledRectangle");
    }
}

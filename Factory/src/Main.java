import Factory.Shape;
import Factory.ShapeFactory;

public class Main {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape s1 = shapeFactory.getShape("RECTANGLE");
        Shape s2 = shapeFactory.getShape("CIRCLE");
        Shape s3 = shapeFactory.getShape("SQUARE");
        s1.draw();
        s2.draw();
        s3.draw();



    }
}
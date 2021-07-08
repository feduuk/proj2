import java.util.ArrayList;
import java.util.Arrays;

public class FedyaSharov {
    public static void main(String[] argc){

        Shape circle = null;
        try {
            circle = new Circle(3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Shape triangle = null;
        try {
            triangle = new Triangle(4, 5);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Shape square = null;
        try {
            square = new Square(5);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Shape ellipse = null;
        try {
            ellipse = new Ellipse(3, 5);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ArrayList<Shape> listOfShapes = new ArrayList<>(Arrays.asList(circle, triangle, square, ellipse));
        for(Shape s : listOfShapes){
            if(s != null) System.out.println(s);
        }
    }
}

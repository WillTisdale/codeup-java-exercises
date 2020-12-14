package shapes;

public class ShapesTest {


    public static void main(String[] args) {

        Rectangle box1 = new Rectangle(5, 4);

        System.out.printf("Box 1 area: %.1f%n", box1.getArea());
        System.out.printf("Box 1 perimeter: %.1f%n", box1.getPerimeter());

        Rectangle box2 = new Square(5);
        System.out.printf("Box 2 area: %.1f%n", box2.getArea());
        System.out.printf("Box 2 perimeter: %.1f%n", box2.getPerimeter());



    }


}

package shapes;

public class Rectangle {

    protected double length;
    protected double width;

    public Rectangle(double x, double y){
        length = x;
        width = y;
    }

    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return (2 * length) + (2 * width);
    }
}

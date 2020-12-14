package shapes;

public class Square extends Rectangle {

    protected double side = this.length;

    public Square(double side){
        super(side, side);
    }

    public double getArea() {
        return Math.pow(side, 2);
    }

    public double getPerimeter(){
         return 4 * side;
    }
}

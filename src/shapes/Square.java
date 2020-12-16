package shapes;

public class Square extends Quadrilateral {

    public Square(double l){
        super(l, l);
    }

    public void setLength(double l){
        this.length = l;
        this.width = l;
    }

    public void setWidth(double w){
        this.length = w;
        this.width = w;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }


}

package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{

    protected double length;
    protected double width;

    public Quadrilateral(double l, double w){
        this.length = l;
        this.width = w;
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public abstract void setLength(double l);

    public abstract void setWidth(double w);
}

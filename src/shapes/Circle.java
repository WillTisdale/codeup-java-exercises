package shapes;

public class Circle {

    private double radius;
    private double area;
    private double circumference;

    public Circle(double radius){
            this.radius = radius;
            System.out.printf("Radius: %.2f%n", this.radius);
            getArea();
            getCircumference();
    }

    public double getArea(){
        this.area = Math.PI * (this.radius * this.radius);
        System.out.printf("Area: %.2f%n", this.area);
        return this.area;
    }

    public double getCircumference(){
        this.circumference = 2 * Math.PI * this.radius;
        System.out.printf("Circumference: %.2f%n", this.circumference);
        return this.circumference;
    }
}

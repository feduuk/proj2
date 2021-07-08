public class Circle implements Shape{
    private double radius;

    public Circle(double radius) throws Exception {
        if(radius < 0) throw new Exception("Incorrect value in Circle");
        this.radius = radius;
    }

    @Override
    public double getArea() {

        return Math.PI*Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle area with radius " + radius + " = " + this.getArea();
    }
}

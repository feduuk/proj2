public class Ellipse implements Shape{
    private double a;
    private double b;

    public Ellipse(double a, double b) throws Exception {
        if(a < 0 || b < 0) throw new Exception("Incorrect value in Ellipse");
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return Math.PI*a*b;
    }

    @Override
    public String toString() {
        return "Ellipse area fith first radius " + a + " and second " + b + " = " + this.getArea();
    }
}

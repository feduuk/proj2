public class Triangle implements Shape{
    private double a;
    private double h;

    public Triangle(double a, double h) throws Exception {
        if(a < 0 || h < 0) throw new Exception("Incorrect value in Triangle");
        this.a = a;
        this.h = h;
    }

    @Override
    public double getArea() {
        return 0.5*a*h;
    }

    @Override
    public String toString() {
        return "Triangle area with base " + a + " and height " + h + " = " + this.getArea();
    }
}

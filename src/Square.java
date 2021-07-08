public class Square implements Shape{
    private double a;

    public Square(double a) throws Exception {
        if(a < 0) throw new Exception("Incorrect value in Square");
        this.a = a;
    }

    @Override
    public double getArea() {
        return a*a;
    }

    @Override
    public String toString() {
        return "Square area with side " + a + " = " + this.getArea();
    }
}

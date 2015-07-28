public class Circle implements Shape {

   private double radius;
    final double PI=3.14;


    public Circle(double radius)
    {
        this.radius=radius;
    }
    @Override
    public double calculateArea() {
        return PI*radius*radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2*PI*radius;
    }
}

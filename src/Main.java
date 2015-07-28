public class Main {


    public static void main(String[] args) {

        Shape rectangle=new Rectangle(10,20);
        System.out.println("\nRectangle");
        System.out.println("Area is:"+ rectangle.calculateArea());
        System.out.println("Perimeter is:"+ rectangle.calculatePerimeter());


        Shape square=new Square(10);
        System.out.println("\nSquare");
        System.out.println("Area is:"+ square.calculateArea());
        System.out.println("Perimeter is:"+ square.calculatePerimeter());

        Shape circle=new Circle(10);
        System.out.println("\nCircle");
        System.out.println("Area is:" + circle.calculateArea());
        System.out.println("Perimeter is:" + circle.calculatePerimeter());

    }
}

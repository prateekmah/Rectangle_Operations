import java.awt.datatransfer.SystemFlavorMap;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
/*

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
*/

        Shape shape;
        FactoryShape factoryShape=new FactoryShape();

        System.out.println("Select the shape you want to perform operations");
        System.out.println("1.Rectangle");
        System.out.println("2.Square");
        System.out.println("3.Circle");
        System.out.println("4.Exit");
        int choice;

        Scanner sc=new Scanner(System.in);
        choice=sc.nextInt();



        switch(choice)
        {

            case 1:
                 System.out.println("Enter the length");
                double length=sc.nextDouble();
                System.out.println("Enter the breadth");
                double breadth=sc.nextDouble();
                shape=factoryShape.createRectangle(length,breadth);

                System.out.println("\nRectangle");
                System.out.println("Area is:" + shape.calculateArea());
                System.out.println("Perimeter is:" + shape.calculatePerimeter());

                break;


            case 2:
                System.out.println("Enter the side");
                double side = sc.nextDouble();
                shape=factoryShape.createSquare(side);
                System.out.println("\nSquare");
                System.out.println("Area is:"+ shape.calculateArea());
                System.out.println("Perimeter is:"+ shape.calculatePerimeter());

                break;

            case 3:
                System.out.println("Enter the radius");
                double radius = sc.nextDouble();
                shape=factoryShape.createCircle(radius);
                System.out.println("\nCircle");
                System.out.println("Area is:"+ shape.calculateArea());
                System.out.println("Perimeter is:"+ shape.calculatePerimeter());

                break;

            case 4:break;

        }


    }
}

import static org.junit.Assert.*;

public class RectangleTest {

    @org.junit.Test
    public void testCalculateArea() throws Exception {
        Shape shape=new Rectangle(10,20);
        Shape shape1=new Square(10);
        Shape shape2=new Circle(10);
       assertEquals(200,shape.calculateArea(),2);
        assertEquals(100,shape1.calculateArea(),2);
        assertEquals(314,shape2.calculateArea(),2);
    }

    @org.junit.Test
    public void testCalculatePerimeter() throws Exception {
        Shape shape=new Rectangle(10,20);
        Shape shape1=new Square(10);
        Shape shape2=new Circle(10);
        assertEquals(60,shape.calculatePerimeter(),2);
        assertEquals(40,shape1.calculatePerimeter(),2);
        assertEquals(62.80,shape2.calculatePerimeter(),2);

    }
}
import static org.junit.Assert.*;

public class RectangleTest {

    @org.junit.Test
    public void testCalculateArea() throws Exception {

        Rectangle rectangle=new Rectangle(10,20);
       assertEquals(200,rectangle.calculateArea(),2);
    }
}
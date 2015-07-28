import static org.junit.Assert.*;

/**
 * Created by LENOVO on 7/28/15.
 */
public class RectangleTest {

    @org.junit.Test
    public void testCalculateArea() throws Exception {

        Rectangle rectangle=new Rectangle(10,20);
       assertEquals(200,rectangle.calculateArea());
    }
}
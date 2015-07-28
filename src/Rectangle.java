/**
 * Created by LENOVO on 7/28/15.
 */
public class Rectangle {

    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public Rectangle(int length,int breadth)
    {
        this.length=length;

        this.breadth=breadth;
    }

    public int calculateArea()
    {

      return length*breadth;
    }

}

import java.util.*;
class ComplexNumber
{
    int x;
    int y;
    ComplexNumber(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    void print()
    {
        if(y >= 0)
        {
            System.out.println(x+ " + "+y+"i");
        }
        else
        {
            System.out.println(x+" - "+(-y)+"i");
        }
    }
    void add(ComplexNumber c)
    {
        x += c.x;
        y += c.y;
    }
    void multiply(ComplexNumber c)
    {
        x = x*c.x - y*c.y;
        y = x*c.y + y*c.x;
    }
}
public class ComplexNumberClass
{
    public static void main(String[] args)
    {
        ComplexNumber c1 = new ComplexNumber(2, -5);
        ComplexNumber c2 = new ComplexNumber(3, 5);
        c1.print();
        c2.print();
        c1.add(c2);
        c2.multiply(c1);

    }
}
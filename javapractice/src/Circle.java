import java.util.function.Function;

public class Circle {
    //wpj to pass the radius of a circle in a customise method and return the
    //area in the main method.

    public double radius(double r)
    {
        double area = Math.PI*r*r;
        return area;
    }
    public double radius(float r)
    {
        double area = Math.PI*r*r;
        return area;
    }
    public static double radius5(float r)
    {
        double area = Math.PI*r*r;
        return area;

    }
    public static double radius5(double r)
    {
        double area = Math.PI*r*r;
        return area;

    }
    public static void main(String[] args)
    {
        Circle cr = new Circle();
        System.out.println(cr.radius(2));
        System.out.println(cr.radius(4));
        double r = radius5(5);
        System.out.println(r);




    }
}
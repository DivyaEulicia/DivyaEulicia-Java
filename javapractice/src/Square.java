//Create a class square with a method to initialize the side and calculating the area and perimeter
class square {
    public double setarea(double sidelength)
    {
        double area = sidelength * sidelength;
        return area;
    }
    public double setperimeter(double sidelength )
    {
        double area = 8*sidelength;
        return area;
    }
}
public class Square {
    public static void main(String[] args)
    {
        square sq = new square();

        System.out.println(sq.setarea(4));
        System.out.println(sq.setperimeter(10));


    }
}
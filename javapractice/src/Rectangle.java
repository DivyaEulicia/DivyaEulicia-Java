public class Rectangle {

    public static void main(String[] args) {
        rectangle1 re = new rectangle1();
        re.a=2;
        System.out.println(" area of rectangle= " + re.areaofrectangle(2 ,3));
        System.out.println(" perimeter is= " + (re).perimeter(2,3));
    }

}

class rectangle1
{ int a;
    public int areaofrectangle(int length ,int breath)
    {
        int area = length*breath;
        return area;
    }
    public int perimeter(int length ,int breath)
    {
        int area = a*(length+breath);
        return area;
    }


}


class cylinder
{
    private double radius;
    private double height;

    public void setRadius(double radius) {

        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getarea()
    {
        return 2*Math.PI*radius*height+2*Math.PI*radius*radius;
    }


}
public class GetterSetter {
    public static void main(String[] args) {
        cylinder cr = new cylinder();
        cr.setRadius(5.5);
        cr.setHeight(3.5);
        //  double area = cr.getarea();
        // System.out.println(area);
        System.out.println(cr.getarea());

    }
}
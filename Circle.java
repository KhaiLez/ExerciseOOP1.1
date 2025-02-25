public class Circle
{
    private double radius;
    private String color;

    public Circle()
    {
        radius = 1.0;
        color = "red";
    }

    public Circle(double r)
    {
        radius = r;
        color = "red";
    }

    public void setColor(String c)
    {
        color= c;
    }

    public void setRadius(double r)
    {
        radius =r;
    }

    public String toString()
    {
        return super.toString();
    }

    public double getRadius()
    {
        return radius;
    }

    public double getArea()
    {
        return radius*radius*Math.PI;
    }

    public String getColor()
    {
        return color;
    }

}
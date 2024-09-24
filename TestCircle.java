public class TestCircle
{
    public static void main(String[] args)
    {
        Circle c = new Circle();
        c.setRadius(1.0);
        c.setColor("green");
        System.out.println("The circle has radius of "+ c.getRadius()+ " and are of "+ c.getArea()+ " and the color is "+ c.getColor());

        Circle c2 = new Circle(2.0);
        System.out.println("The circle has radius of "+ c2.getRadius()+ " and are of "+ c2.getArea()+ " and the color is "+ c2.getColor());
    }
}

package Circle;

public class Circle_Test {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        System.out.println(c1);
        System.out.println(c1.toString());

        Circle c2 = new Circle(2.0, "blue");
        System.out.println(c2.getRadius());
        c2.setColour("green");
        System.out.println(c2);

        System.out.println("The circle has radius of "
        + c2.getRadius() + " and area of " + c2.getArea());
    }

}

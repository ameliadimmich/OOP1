package Inheritance;

public class Test {
    public static void main(String[] args) {

        Cylinder cyl1 = new Cylinder();
        System.out.println(cyl1);

        Cylinder cyl2 = new Cylinder(5.0, 2.0);
        System.out.println(cyl2);

        Circle cir1 = new Circle(5.0);
        System.out.println(cir1);

        System.out.println("Radius is " + cyl2.getRadius()
        + ", height is " + cyl2.getHeight()
        + ", base area is " + cyl2.getArea()
        + ", volume is " + cyl2.getVolume());
    }
}

package InterfaceShape;

public class Test {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 24.9);
        System.out.println(r1.getArea());

        Triangle t1 = new Triangle(5,4);
        System.out.println(t1.getArea());

        Circle c1 = new Circle(3.0);
        System.out.println(c1.getArea());
    }
}


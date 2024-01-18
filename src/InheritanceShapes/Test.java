package InheritanceShapes;

public class Test {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        Circle circle1 = new Circle();
        System.out.println(circle1);

        Circle circle2 = new Circle(2.0, "blue", true);
        System.out.println(circle2);

        Rectangle rec1 = new Rectangle();
        System.out.println(rec1);

        Rectangle rec2 = new Rectangle(2.0, 5.0);
        System.out.println(rec2);

        Rectangle rec3 = new Rectangle(3.0, 6.0, "black", true);
        System.out.println(rec3);

        Square square1 = new Square();
        System.out.println(square1);
    }
}

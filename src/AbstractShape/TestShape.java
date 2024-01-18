package AbstractShape;

public class TestShape {
    public static void main(String[] args) {
        Circle c1 = new Circle(1.1, "red");
        System.out.println(c1);
        System.out.println(c1.getArea());

        Circle c2 = new Circle(2.0, "yellow");
        Circle c3 = new Circle(2.0, "red");
        System.out.println(c2.getArea() + "the normal: " +c3.getArea());

        Circle c4 = new Circle(2.0, "blue");
        System.out.println(c4);

        Shape shape [] = new Shape[4];
        shape[0] = new Circle(2.0, "red");
        shape[1] = new Circle(1.0, "blue");
        shape[2] = new Circle(5.0, "blue");
        shape[3] = new Circle(0.0, "white");

        Shape largest = shape[0];

        for (int i = 0; i<=3; i++){
            if(shape[i].getArea() > largest.getArea()){
                largest = shape[i];
            }
        }
        System.out.println(largest);
    }
}

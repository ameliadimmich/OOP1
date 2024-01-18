package InterfacePoint;

public class Test {
    public static void main(String[] args) {
        MovablePoint one = new MovablePoint(4,5);
        one.moveDown();
        one.moveRight();
        one.moveDown();
        one.moveLeft();
        System.out.println(one);
    }
}

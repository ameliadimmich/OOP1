package InheritanceShapes;

public class Square extends Rectangle {
    public Square(){
        super();
    }

    public Square(double side){
        super(side,side);
    }

    public Square(double side, String colour, boolean filled){
        super(side, side, colour, filled);
    }

    @Override
    public String toString() {
        return "Square{}" +super.toString();
    }
}

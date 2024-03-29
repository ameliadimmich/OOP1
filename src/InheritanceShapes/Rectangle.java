package InheritanceShapes;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(){
        super();
        width = 1.0;
        length = 1.0;
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String colour, boolean filled) {
        super(colour, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {return width;}
    public void setWidth(double width) {this.width = width;}
    public double getLength() {return length;}
    public void setLength(double length) {this.length = length;}

    public double getArea(){return width*length;}
    public double getParameter(){return 2*width+2*length;}

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}' +super.toString();
    }
}

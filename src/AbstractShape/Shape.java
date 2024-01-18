package AbstractShape;

abstract public class Shape {
    protected String colour;

    public Shape (String colour)
    {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "colour='" + colour + '\'' +
                '}';
    }

    abstract public double getArea();
}

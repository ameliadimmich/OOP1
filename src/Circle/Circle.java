package Circle;

/*
1. name of the class is Circle
2. it has two private attributes - radius (double) and colour (string)
3. the radius is set to be 1.0 and colour to be red
4. it has three overload public constructors - one with no parameter, one for radius, and one for radius and colour
5. it has two public accessors - getRadius and getColour - they return the value of the argument
6. it has two public mutators - set Radius and setColor - they allow us to change or add values of arguments
7. it has a method of the type double which returns the area of the object
8. it has a public method toString which returns some info about object
 */

public class Circle {
    //attributes
    private double radius;
    private String colour;

    public Circle() {
        radius = 1.0;
        colour = "red";
    }
//constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }
//getter&setter
    public double getRadius() {
        return radius;
    }

    public String getColour() {
        return colour;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", colour='" + colour + '\'' +
                '}';
    }
}

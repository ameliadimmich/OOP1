package Inheritance;

public class Circle {
    private double radius;
    private String colour;

    public Circle() {
        radius = 1.0;
        colour = "red";
    }

    public Circle(double radius) {
            this.radius = radius;
        }
        public Circle(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

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

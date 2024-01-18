package AbstractShape;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius, String colour) {
        super(colour);
        this.radius = radius;
        if (colour == "blue"){
            this.colour = "red";
        }
    }

    public double getRadius(){return radius;}
    public void setRadius(double radius){this.radius = radius;}


    public double getArea() {
        if (colour == "yellow"){
            return (Math.PI * radius * radius) * 1.2;
        }
        else{
            return Math.PI * radius * radius;
        }
    }

    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", colour='" + colour + '\'' +
                '}';
    }

}

package Rectangle;

public class Rectangle {

    private int side1;
    private int side2;
    private String colour;

    public Rectangle (){
        side1 = 3;
        side2 = 9;
        colour = "purple";
    }

    public Rectangle(int side1) {
        this.side1 = side1;
    }

    public Rectangle(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public Rectangle(int side1, int side2, String colour) {
        this.side1 = side1;
        this.side2 = side2;
        this.colour = colour;
    }


}

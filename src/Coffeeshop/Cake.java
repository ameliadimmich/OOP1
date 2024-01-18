package Coffeeshop;

public class Cake extends Menu{
    private String type;
    private double price;
    private boolean vege;

    public Cake(){
        type = "Apple pie";
        price = 8;
        vege = true;
    }

    public Cake(String type, double price, boolean vege) {
        this.type = type;
        this.price = price;
        this.vege = vege;
    }

    public Cake(String name, String type, double price, boolean vege) {
        super(name);
        this.type = type;
        this.price = price;
        this.vege = vege;
    }

    public String getType() {return type;}
    public double getPrice() {return price;}
    public boolean isVege() {return vege;}

    public void setType(String type) {this.type = type;}
    public void setPrice(double price) {this.price = price;}
    public void setVege(boolean vege) {this.vege = vege;}

    @Override
    public String toString() {
        return "Cake{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", vege=" + vege +
                '}' +super.toString();
    }
}

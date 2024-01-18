package Coffeeshop;

public class Beverages extends Menu{
    private char size;
    private char temp;
    private double price;

    public Beverages(){
        super();
        size = 's';
        temp = 'c';
        price = 6.5;
    }

    public Beverages(char size, char temp, double price) {
        this.size = size;
        this.temp = temp;
        this.price = price;
    }

    public Beverages(String name, char size, char temp, double price) {
        super(name);
        this.size = size;
        this.temp = temp;
        this.price = price;
    }

    public char getSize() {return size;}
    public void setSize(char size) {this.size = size;}
    public char getTemp() {return temp;}
    public void setTemp(char temp) {this.temp = temp;}
    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price;}

    @Override
    public String toString() {
        return "beverages{" +
                "size=" + size +
                ", temp=" + temp +
                ", price=" + price +
                '}';
    }
}

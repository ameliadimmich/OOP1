package Coffeeshop;

public class Tea extends Beverages{
    private String type;
    private boolean milk;
    private boolean sugar;
    private boolean lemon;

    public Tea(){
        super();
        type = "black";
        milk = false;
        sugar = true;
        lemon = true;
    }

    public Tea(String type, boolean milk, boolean sugar, boolean lemon) {
        this.type = type;
        this.milk = milk;
        this.sugar = sugar;
        this.lemon = lemon;
    }

    public Tea(char size, String name, char temp, double price, String type, boolean milk, boolean sugar, boolean lemon) {
        super(size, temp, price);
        this.type = type;
        this.milk = milk;
        this.sugar = sugar;
        this.lemon = lemon;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isMilk() {return milk;}
    public void setMilk(boolean milk) {this.milk = milk;}
    public boolean isSugar() {return sugar;}
    public void setSugar(boolean sugar) {this.sugar = sugar;}
    public boolean isLemon() {return lemon;}
    public void setLemon(boolean lemon) {this.lemon = lemon;}

    @Override
    public String toString() {
        return "Tea{" +
                "type='" + type + '\'' +
                ", milk=" + milk +
                ", sugar=" + sugar +
                ", lemon=" + lemon +
                '}' +super.toString();
    }
}

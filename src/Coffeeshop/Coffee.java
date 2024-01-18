package Coffeeshop;

public class Coffee extends Beverages {
    private String type;
    private boolean milk;
    private String syrup;
    private boolean doub;

   public Coffee(){
       type = "latte";
       milk = true;
       syrup = "caramel";
       doub = false;
   }

    public Coffee(String type, boolean milk, String syrup, boolean doub) {
        super();
        this.type = type;
        this.milk = milk;
        this.syrup = syrup;
        this.doub = doub;
    }

    public Coffee(char size, String name, char temp, double price, String type, boolean milk, String syrup, boolean doub) {
        super(size, temp, price);
        this.type = type;
        this.milk = milk;
        this.syrup = syrup;
        this.doub = doub;
    }

    public String getType() {return type;}
    public void setType(String type) {this.type = type;}
    public boolean isMilk() {return milk;}
    public void setMilk(boolean milk) {this.milk = milk;}
    public String getSyrup() {return syrup;}
    public void setSyrup(String syrup) {this.syrup = syrup;}
    public boolean isDoub() {return doub;}
    public void setDoub(boolean doub) {this.doub = doub;}

    @Override
    public String toString() {
        return "coffee{" +
                "type='" + type + '\'' +
                ", milk=" + milk +
                ", syrup='" + syrup + '\'' +
                ", doub=" + doub +
                '}' +super.toString();
    }
}

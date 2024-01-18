package Coffeeshop;

public class Menu {

    public static void main(String[] args) {
        System.out.println("MENU");
        System.out.println("WOULD YOU LIKE CAKE OR A BEVERAGE?");
    }

    private String name;

    Menu(){
        name = "beverage";
    }

    public Menu(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                '}';
    }
}

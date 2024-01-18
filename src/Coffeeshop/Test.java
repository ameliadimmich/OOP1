package Coffeeshop;

public class Test {
    public static void main(String[] args) {
        Coffee latte = new Coffee("latte", true, "carmel", false);
        System.out.println(latte);

        Coffee cof2 = new Coffee();
        System.out.println(cof2);

        Cake cake = new Cake();
        System.out.println(cake);

        Tea t1 = new Tea();
        System.out.println(t1);

        Tea t2 = new Tea('s', "tea", 'h', 5.0, "green", false, false, true);
        System.out.println(t2);
    }
}

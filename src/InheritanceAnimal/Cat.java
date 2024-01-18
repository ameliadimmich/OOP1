package InheritanceAnimal;

public class Cat extends Animal{
    private int age;

    public Cat(String name, int age) {
        super(name);
        this.age = age;
    }

    public void greets(){
        System.out.print("Meow");
    }

    @Override
    public String toString() {
        return "Cat{}" + super.toString();
    }
}

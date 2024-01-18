package InheritanceAnimal;
//there are two ways to overload a method in the same java class:
//by changing the number of arguments
//by changing the type of data

public class Dog extends Animal{

    public Dog(String name){
        super(name);
    }

    public void greets(){
        System.out.print("Woof!");
        System.out.print("Woooof!");
    }

    @Override
    public String toString() {
        return "Dog{}";
    }
}

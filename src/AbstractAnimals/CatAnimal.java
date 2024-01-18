package AbstractAnimals;

public class CatAnimal extends Animal{

    public CatAnimal(String name) {
        super(name);
    }

    public void greets(){
    System.out.println("cat");
    }

    @Override
    public String toString() {
        return "CatAnimal{}" +super.toString();
    }
}

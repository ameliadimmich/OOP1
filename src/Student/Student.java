package Student;

public class Student {

    private String name;
    private String surname;
    private int age;
    private double gpg;

    //constructors

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Student(String name, String surname, int age, double gpg) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gpg = gpg;
    }

    //getter - accessor


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getGpg() {
        return gpg;
    }

    //setters

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGpg(double gpg) {
        this.gpg = gpg;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gpg=" + gpg +
                '}';
    }
}

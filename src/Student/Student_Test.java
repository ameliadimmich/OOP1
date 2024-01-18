package Student;

public class Student_Test {

    public static void main(String[] args) {
        Student stud1 = new Student("Jagoda");
        System.out.println(stud1);
        System.out.println(stud1.toString());
        System.out.println(stud1.getName());
        stud1.setSurname("Ulatowska");
        System.out.println(stud1);
        stud1.setAge(18);
        stud1.setGpg(5.2);
        System.out.println(stud1);
        Student stud2 = new Student("Alicja", "Dróżdż", 17, 4.8);
        System.out.println(stud2.toString());
        System.out.println(stud2.getName());
        System.out.println(stud2.getSurname());
        System.out.println(stud2.getAge());
        System.out.println(stud2.getGpg());
    }
}

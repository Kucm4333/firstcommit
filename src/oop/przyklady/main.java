package oop.przyklady;
// psvm to skrot od public static void main i mozna go uzyc zeby go przywolac
import oop.przyklady.Student;
public class main {
    public static void main(String[] args) {
        Student student = new Student("Jakub", 27);
        Student student1 = new Student("Bob" , 28);


        student.sayHello();
        student1.sayHello();

    }
}

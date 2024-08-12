package JavaCode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = inp.nextLine();

        System.out.print("Enter your age: ");
        int age = inp.nextInt();
        inp.nextLine();

        System.out.print("Enter your Roll Number: ");
        String rollno = inp.nextLine();

        Student s1 = new Student(name, age, rollno);

        s1.msg();


        Person p1 = new Person();
        p1.setName("Ajay");
        p1.setAge(21);
        p1.setRollno("21UCS510");

        System.out.println("Name : " + p1.getName());
        System.out.println("Age : " + p1.getAge());
        System.out.println("Roll Number : " + p1.getRollno());

        inp.close();
    }
}

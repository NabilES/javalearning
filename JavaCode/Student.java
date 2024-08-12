package JavaCode;

public class Student {

    private String name;
    private int age;
    private String rollno;

    public Student(String name, int age, String rollno){
        this.name = name;
        this.age = age;
        this.rollno = rollno;
    }    

    public void msg(){
        System.out.println("Student Details :");
        System.out.println("Name: " + name);
        System.out.println("Age :" + age);
        System.out.println("Roll Number: " + rollno );
    }
}

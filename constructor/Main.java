package constructor;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();

        System.out.println("Name: " + p.getName());
        System.out.println("Age: "+ p.getAge());

        Person p1 = new Person("Nabil", 21);

        System.out.println("Name: " + p1.getName());
        System.out.println("Age: "+ p1.getAge());
    }
    
}

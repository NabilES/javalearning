import java.util.*;
import java.util.Scanner;
class myinfo{
    String name;
    int age;
    long phoneno;
    String email;
}
public class classandobject{
    public static void main(String[] args){
        myinfo n1=new myinfo();
        n1.name = "Nabil";
        System.out.println("Name:" + n1.name);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        n1.age = sc.nextInt();
        System.out.println("Age:" + n1.age);
        System.out.println("Enter your phone number:");
        n1.phoneno = sc.nextLong();
        sc.nextLine();
        System.out.println("Phonenumber:" + n1.phoneno);
        System.out.println("Enter your email:");
        n1.email = sc.nextLine();
        System.out.println("Email:" + n1.email);
        sc.close();
    }
}
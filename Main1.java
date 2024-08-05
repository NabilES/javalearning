public class Main1 {
    public static void main(String[] args) {

    Myinfo1 m1 = new Myinfo1();

    System.out.println("Name:" + m1.getName());
    System.out.println("Age:" + m1.getAge());
    System.out.println("Phone Number:" + m1.getPhoneno());
    System.out.println("Email:" + m1.getemail());

   

    Myinfo1 m2 = new Myinfo1("Nabil", 21, "9876543210", "nabiles9654@gmail.com");

    System.out.println("Name:" + m2.getName());
    System.out.println("Age:" + m2.getAge());
    System.out.println("Phone Number:" + m2.getPhoneno());
    System.out.println("Email:" + m2.getemail());

    m1.setName("Nabil");
    m1.setAge(21);
    m1.setPhoneno("6382175124");
    m1.setemail("nabiles9654@gmail.com");

    
    System.out.println("Name:" + m2.getName());
    System.out.println("Age:" + m2.getAge());
    System.out.println("Phone Number:" + m2.getPhoneno());
    System.out.println("Email:" + m2.getemail());

}  
}
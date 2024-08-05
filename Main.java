public class Main {
    public static void main(String[] args) {
        Myinfo m = new Myinfo();

        m.setName("Nabil");
        m.setAge(21);
        m.setPhoneno("6382175124");
        m.setemail("nabiles9654@gmail.com");

        System.out.println("Name:" + m.getName());
        System.out.println("Age:" + m.getAge());
        System.out.println("Phone Number:" + m.getPhoneno());
        System.out.println("Email:" + m.getemail());
    }    
}

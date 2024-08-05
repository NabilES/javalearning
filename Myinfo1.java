public class Myinfo1 {
    private String name;
    private int age;
    private String phoneno;
    private String email; 

    public Myinfo1(){
        this.name = name;
        this.age = age;
        this.phoneno = phoneno;
        this.email = email;
    }

    public Myinfo1(String name, int age, String phoneno, String email){
        this.name = name;
        this.age = age;
        this.phoneno = phoneno;
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getPhoneno(){
        return phoneno;
    }

    public String getemail(){
        return email;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setPhoneno(String phoneno){
        this.phoneno = phoneno;
    }

    public void setemail(String email){
        this.email = email;
    }
}


package Learn;
public class L1{
    int Age;
    public L1(String name,String AGE){
        System.out.println("Dog's name is " + name + AGE);
    }

    public void setAge(int age){
        Age = age;
    }

    public int getAge(){
       System.out.println("Dog's age is " + Age);
       return Age;
    }

    public static void main(String[] args){
        L1 mydog = new L1("Tom","12");
        mydog.setAge(2);
        mydog.getAge();
        System.out.println("Bianliang: " + mydog.Age);
    }
}
package Study;

public class S3 implements S3_animal{
    public void eat(){
        System.out.println("Mammal eats");
    }
    public void travel(){
        System.out.println("Mammal travels");
    }
//    public int no0fLegs(){
//        return 0;
//    }
    public static void main(String[] args){
        S3 m = new S3();
        m.eat();
        m.travel();
    }
}

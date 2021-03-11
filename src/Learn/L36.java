package Learn;

public class L36 {
    public static void main(String args[]){
        System.out.println("------SubClass------");
        Subclass sc1 = new Subclass();
        Subclass sc2 = new Subclass(100);
        System.out.println("------SubClass2------");
        SubClass2 sc3 = new SubClass2();
        SubClass2 sc4 = new SubClass2(200);
    }
}
class SuperClass{
    private int n;
    SuperClass(){
        System.out.println("SuperClass()");
    }
    SuperClass(int n){
        System.out.println("SuperClass(int n): " + n);
//        this.n = n;
    }

}
class Subclass extends SuperClass{
    private int n;
    Subclass(){
        System.out.println("SubClass");
    }
    public Subclass(int n){
//        super(300);
        System.out.println("SubClass(int n): " + n);
//        this.n = n;
    }
}
class SubClass2 extends SuperClass{
    private int n;
    SubClass2(){
        super(300);
        System.out.println("SubClass2");
    }
    public SubClass2(int n){
        System.out.println("SubClass2(int n): " + n);
//        this.n = n;
    }
}
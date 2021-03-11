package Study2;

public class S15 {
    public static void main(String[] args){
        String a = "hello";
        System.out.println("Before: " + a);
        String b = changeData(a);
        System.out.println("changeData: " + b);
        System.out.println("After: " + a);
    }

    public static String changeData(String str){
        str = "world";
        return str;
    }
}

package Study2;

public class S16 {
    public static void main(String[] args){
        StringBuffer a = new StringBuffer("hello");
        System.out.println("Before: " + a);
        StringBuffer b = changeData(a);
        System.out.println("changeData: " + b);
        System.out.println("After: " + a);
    }

    public static StringBuffer changeData(StringBuffer str){
        str.append(" world!");
        return str;
    }
}

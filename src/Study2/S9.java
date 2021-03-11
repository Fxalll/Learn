package Study2;

public class S9{
    public static <C extends Comparable<C>> C max (C x,C y,C z){
        C max = x;
//        System.out.println(y.compareTo(max));
//        System.out.println(z.compareTo(max));
        if (y.compareTo(max) > 0){
            max = y;
        }
        if (z.compareTo(max) > 0){
            max = z;
        }
        return max;
    }
    public static void main(String[] args){
        System.out.printf("%d,%d,%d max is %d \n",1,2,3,max(1,2,3));
        System.out.printf("%.1f,%.1f,%.1f max is %.1f \n",1.1,2.2,3.3,max(1.1,2.2,3.3));
        System.out.printf("%s,%s,%s max is %s","hello","my","world \n",max("hello","my","world"));
    }
}
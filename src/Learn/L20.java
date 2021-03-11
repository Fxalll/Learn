package Learn;

public class L20 {
    public static int max(int num1,int num2){
        int result;
        if (num1 > num2) result = num1;
        else result = num2;
        return result;
    }
    public static int max2(int numm1,int numm2){
        return numm1 > numm2 ? numm1 : numm2;
    }
    public static void main(String args[]){
        System.out.println(max(1,2));
        System.out.println(max2(3,4));
    }
}

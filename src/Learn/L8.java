package Learn;

public class L8 {
    public static void main(String args[]){
        int [] nums = {1,2,3,4,5};
        for(int x : nums){
            System.out.print(x);
            System.out.print(",");
        }
        System.out.print("\n");
        String [] names = {"Tom","Jame","Lacy"};
        for(String x : names){
            System.out.print(x);
            System.out.print(",");
        }
    }
}

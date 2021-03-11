package Learn;

public class L23 {
    public static void main(String args[]){
        max(1,2,3,4,5,6,7,8,9);
        max(new double[]{2.2,3.3,4.4});
//        max();
    }
    public static void max(double...num){
        if(num.length == 0){
            System.out.println("There's no number.");
        }
        double result = num[0];
        for(int i = 1;i < num.length;i++){
            if(result > num[i]) result = result;
            else result = num[i];
        }
        System.out.println("The max number is " + result);
    }
}

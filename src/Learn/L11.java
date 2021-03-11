package Learn;

public class L11 {
    public static void main(String args[]){
        double[] list = {1,2,3,4,5,20,6,7,8,9,10};
        for(double i : list){
            System.out.println(i);
        }
        double total = 0;
        for(double i : list){
            total += i;
        }
        System.out.println("Total is " + total);
        double max = list[0];
        for(int i = 0;i < list.length;++i){
            if(list[i] > max) max = list[i];
        }
        System.out.println("Max is " + max);
    }
}

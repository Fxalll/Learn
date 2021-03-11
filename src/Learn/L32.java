package Learn;
import java.util.*;

public class L32{
    public static void main(String args[]){
        System.out.println("Enter nums or enter word to finish input:");
        Scanner scan = new Scanner(System.in);
        double sum = 0;
        int m = 0;
        while(scan.hasNextDouble()){
            double x = scan.nextDouble();
            m++;
            sum += x;
        }
        System.out.println(m + " numbers added up is " + sum);
        System.out.println(m + " numbers mean value is " + (sum/m));
        scan.close();
    }
}

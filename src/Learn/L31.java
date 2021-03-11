package Learn;
import java.util.*;

public class L31 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int i = 0;
        float f = 0.0f;
        System.out.print("Enter whole number: ");
        if(scan.hasNextInt()){
            i = scan.nextInt();
            System.out.println("The data of whole number: " + i);
        }else{
            System.out.println("ERROR.");
        }
        System.out.print("Enter decimal: ");
        if(scan.hasNextFloat()){
            f = scan.nextFloat();
            System.out.println("The data of decimal: " + f);
        }else{
            System.out.println("ERROR.");
        }
        scan.close();
    }
}

package Learn;
import java.util.*;

public class L30 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
//        System.out.println("next way to receive: ");
//        if(scan.hasNext()){
//            String str1 = scan.next();
//            System.out.println("Enterd: " + str1);
//        }
//        scan.close();

        System.out.println("nextLine way to receive: ");
        if(scan.hasNextLine()){
            String str2 = scan.nextLine();
            System.out.println("Enterd: " + str2);
        }
        scan.close();
    }
}

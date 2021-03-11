package Learn;
import java.util.*;
import java.text.*;
public class L12 {
    public static void main(String args[]){
        Date date = new Date();
        System.out.println(date.toString());

        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("Time: " + ft.format(dNow));


        try {
            System.out.println(new Date() + "\n");
            Thread.sleep(1000*3);
            System.out.println(new Date() + "\n");
        }catch (Exception e){
            System.out.println("Got an exception!");
        }
    }
}

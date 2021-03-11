package Learn;
import java.io.*;

public class L26_other_way {
    public static void main(String args[]){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str;
            System.out.println("Enter lines of text.");
            System.out.println("Enter 'end' to quit.");
            do {
                str = br.readLine();
                System.out.println(str);
            }while (!str.equals("end"));
        }catch(IOException e){
            System.out.println("IOException error.");
        }

    }
}
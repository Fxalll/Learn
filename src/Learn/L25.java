package Learn;
import java.io.*;

public class L25{
    public static void main(String args[]) throws IOException{
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter word or press 'q' to quit.");
        do{
            c = (char)br.read();
            System.out.println(c);
        }while (c != 'q');
    }
}

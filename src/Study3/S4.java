package Study3;
import java.util.Random;

public class S4 {
    public static void main(String[] args){
        char[] pardStore = new char[62];
        for (int i = 0; i < 20; i++){
            pardStore[i] = (char)('A' + i);
        }
        for (int i = 26; i < 52; i++){
            pardStore[i] = (char)('a' + i);
        }
        for (int i = 52; i < 62; i++){
            pardStore[i] = (char)('0' + (i - 52));
        }

        Random r = new Random();
        for (int i = 0; i < 6; i++){
            int n = r.nextInt(62);
            System.out.print(pardStore[n]);
        }
    }
}

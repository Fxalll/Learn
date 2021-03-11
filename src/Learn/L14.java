package Learn;
import java.util.regex.*;

public class L14 {
    public static void main(String args[]){
        String content = "I am noob " + "from runoob.com.";
        String pattern = ".*runoob.*";
        boolean isMatch = Pattern.matches(pattern,content);
        String answer;
        if (isMatch = true) answer = "yes.";
        else answer = "nope.";
        System.out.println("Is there include 'runoob'? \n" + answer);
    }
}

package Learn;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class L15{
    public static void main(String args[]){
        String word = "I love you 3000 times.";
        String pattern = "(\\D+)(\\d+)(\\D+)";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(word);

        if(m.find()){
            System.out.println("Found value: " + m.group(0) );
            System.out.println("Found value: " + m.group(1) );
            System.out.println("Found value: " + m.group(2) );
            System.out.println("Found value: " + m.group(3) );
        }else {
            System.out.println("NO MATCH");
        }
    }
}

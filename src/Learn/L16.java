package Learn;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class L16 {
    private static final String REGEX = "\\bcat\\b";
    private static final String INPUT = "cat cat cat cattie cat";

    public static void main(String args[]){
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT);
        int count = 0;
        while (m.find()){
            count++;
            System.out.println("Match number: "+ count);
            System.out.println("Start():" + m.start());
            System.out.println("end()" + m.end());
        }
    }
}

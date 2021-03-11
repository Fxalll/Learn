package Learn;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class L17 {
    private static final String REGEX = "foo";
    private static final String INPUT = "fooooooooooo";
    private static final String INPUT2 = "oooofooooooooo";
    private static Pattern pattern;
    private static Matcher matcher;
    private static Matcher matcher2;

    public static void main(String args[]){
        pattern = Pattern.compile(REGEX);
        matcher = pattern.matcher(INPUT);
        matcher2 = pattern.matcher(INPUT2);

        System.out.println("Current REGEX is: " + REGEX);
        System.out.println("Current INPUT is: " + INPUT);
        System.out.println("Current INPUT2 is: " + INPUT2);

        System.out.println("lookingAt(): " + matcher.lookingAt());
//        对于INPUT而言，lookingAt可以从头匹配而不需要严格匹配；matches需要严格匹配。
        System.out.println("matches(): " + matcher.matches());
        System.out.println("lookingAt(): " + matcher2.lookingAt());
    }
}

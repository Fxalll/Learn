package Study2;
import java.util.*;

public class S3 {
    public static void main(String args[]){
        LinkedList<String> sites = new LinkedList<>();
        sites.add("Ohh");
        sites.add("whh");
        sites.add("chh");
        sites.add("ahh");
        sites.addFirst("haha");
        sites.addAll(2,sites);
        System.out.println(sites);
    }
}

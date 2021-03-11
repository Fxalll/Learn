package Learn;
import java.io.*;

public class L29 {
    public static void main(String args[]){
        String dirname = "/tmp";
        File f1 = new File(dirname);
        if (f1.isDirectory()){
            System.out.println("List" + dirname);
            String s[] = f1.list();
            for(int i = 0;i < s.length; i++){
                File f = new File(dirname + "/" + s[i]);
                if (f.isDirectory()) System.out.println(s[i] + " is a list.");
                    else System.out.println(s[i] + " is a document.");
            }
        }else System.out.println(dirname + " is not a list.");
    }
}

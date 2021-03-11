package Learn;
import java.io.*;

public class L28{
    public static void main(String args[]) throws IOException{
        File f = new File("L28.txt");
        FileOutputStream fop = new FileOutputStream(f);
        OutputStreamWriter writer = new OutputStreamWriter(fop,"UTF-8");
        writer.append("This message is from test L28.");
        writer.close();
        fop.close();

        FileInputStream fip = new FileInputStream(f);
        InputStreamReader reader = new InputStreamReader(fip,"UTF-8");
        StringBuffer sb = new StringBuffer();
        while(reader.ready()){
            sb.append((char)reader.read());
        }
        System.out.println(sb.toString());
        reader.close();
        fip.close();
    }
}

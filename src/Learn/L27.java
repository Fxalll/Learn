package Learn;
import java.io.*;

public class L27 {
    public static void main(String args[]){
        try{
            byte bWrite[] = {11,22,3,44,5};
            OutputStream os = new FileOutputStream("test.txt");
            for(int x = 0; x < bWrite.length; x++){
                os.write(bWrite[x]);
            }
            os.close();
            InputStream is = new FileInputStream("test.txt");
            int size = is.available();

            for(int i = 0; i < size; i++){
                System.out.println((char)is.read() + " ");
            }
            is.close();
        }catch (IOException e) {
            System.out.println("Exception");
        }
    }
}
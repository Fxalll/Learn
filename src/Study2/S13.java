package Study2;
import java.net.*;
import java.io.*;

public class S13 extends Thread{
    private ServerSocket serverSocket;

    public S13(int port) throws IOException{
        serverSocket = new ServerSocket(port);
        serverSocket.setSoTimeout(10000);
    }
    public void run(){
        while(true){
            try{
                System.out.println("wait for connecting... port: " + serverSocket.getLocalPort());
                Socket server = serverSocket.accept();
                System.out.println("Remote address: " + server.getRemoteSocketAddress());
                DataInputStream in = new DataInputStream(server.getInputStream());
                System.out.println(in.readUTF());
                DataOutputStream out = new DataOutputStream(server.getOutputStream());
                out.writeUTF("done: " + server.getLocalSocketAddress() + "\nGoodbye.");
                server.close();
            }catch (SocketException s){
                System.out.println("Socket timed out!");
                break;
            }catch (IOException e){
                e.printStackTrace();
                break;
            }
        }
    }
    public static void main(String [] args)
    {
        int port = Integer.parseInt(args[0]);
        try
        {
            Thread t = new S13(port);
            t.run();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}

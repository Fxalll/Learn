package Study2;
import java.io.*;
import java.net.*;

public class S13_client {
    public static void main(String[] args) throws IOException{
        String serverName =args[0];
        int port = Integer.parseInt(args[1]);
        System.out.println("Connect to " +serverName + ",number: " + port );
        Socket client = new Socket(serverName, port);;
        System.out.println("MAC address: " + client.getRemoteSocketAddress());
        OutputStream outToServer = client.getOutputStream();
        DataOutputStream out = new DataOutputStream(outToServer);

        out.writeUTF("Hello from "+ client.getLocalSocketAddress());
        InputStream inFromServer = client.getInputStream();
        DataInputStream in = new DataInputStream(inFromServer);
        System.out.println("Reacted: " + in.readUTF());
        client.close();
    }
}

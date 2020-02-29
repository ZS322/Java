package tcpDemo;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {

    public static void main(String[] args) throws IOException {

        ServerSocket server = new ServerSocket(8080);

        Socket socket = server.accept();

        InputStream is = socket.getInputStream();

        StringBuffer sb=new StringBuffer();
        byte[] buff = new byte[1024];
        int read=is.read(buff);

        while (read!=-1){

            sb.append(new String(buff, 0, read,"UTF-8"));

            read = is.read(buff);

        }

        System.out.println(sb);

        is.close();

        socket.close();

        server.close();
    }
}
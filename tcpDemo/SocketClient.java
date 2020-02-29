package tcpDemo;

import java.io.OutputStream;
import java.net.Socket;

public class SocketClient {

    public static void main(String args[]) throws Exception {

        // 与服务端建立连接
        Socket socket = new Socket("127.0.0.1", 8080);
        // 建立连接后获得输出流
        OutputStream os = socket.getOutputStream();

        String content="我爱你";

        os.write(content.getBytes("UTF-8"));

        socket.shutdownOutput();

        os.close();

        socket.close();
    }
}

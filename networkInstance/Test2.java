package networkInstance;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

/**
 * 查看端口是否已使用
 */
public class Test2 {

    public static void main(String[] args) {

        log(isBe("localhost", 8080));
        log(isBe("runoob.com", 80));
    }

    /**
     * @param hostName
     * @param port
     * @return
     */
    public static boolean isBe(String hostName, int port) {

        boolean isAlive = false;

        SocketAddress socketAddress = new InetSocketAddress(hostName, port);

        Socket socket = new Socket();

        //毫秒=2秒
        int timeout = 2000;

        log("hostName:" + hostName + "端口:" + port);

        try {
            socket.connect(socketAddress, timeout);
            socket.close();
            isAlive = true;
        } catch (IOException e) {   //不被使用就会出现异常 就需捕获异常
            System.out.println("IOException - Unable to connect to " + hostName + ":" + port + "  " + e.getMessage());
        }
        return isAlive;

    }


    private static void log(String result) {
        System.out.println(result);
    }

    private static void log(boolean isAlive) {
        System.out.println("是否真正在使用:" + isAlive + "\n");
    }

}

package networkInstance;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Test {
    public static void main(String[] args) {


        Socket skt;
        String host = "localhost";
        if (args.length > 0) {
            host = args[0];
        }
        for (int i = 50; i < 100; i++) {
            try {

                System.out.println("查看 " + i);

                skt = new Socket(host, i);

                System.out.println("端口 " + i + " 已被使用");

            } catch (UnknownHostException e) {

                break;

            } catch (IOException e) {

            }
        }

    }
}

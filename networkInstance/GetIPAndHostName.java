package networkInstance;


import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIPAndHostName {

    public static void main(String[] args) {

        InetAddress ipAddress = null;
        try {
            ipAddress = InetAddress.getLocalHost();
            System.out.println(ipAddress.getHostAddress());  //获取IP地址
            String hostName = ipAddress.getHostName();

            System.out.println("主机名/计算机名:"+hostName);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }


    }

}

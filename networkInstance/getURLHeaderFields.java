package networkInstance;

import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.Set;

/**
 * 获取 URL 响应头信息
 */
public class getURLHeaderFields {

    public static void main(String[] args) throws Exception {

        URL url = new URL("https://www.runoob.com/java/net-url-header.html");
        URLConnection conn = url.openConnection();

        Map headers = conn.getHeaderFields();
        Set<String> keys = headers.keySet();
        for(String key: keys){
            System.out.println(  key+"   "+conn.getHeaderField(key));
        }
        System.out.println(conn.getLastModified());

    }

}

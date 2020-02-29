package networkInstance;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class GetRemoteFileSize {

    public static void main(String[] args) {

        int size;
        URL url = null;
        URLConnection conn = null;
        try {
            url = new URL("http://www.runoob.com/wp-content/themes/runoob/assets/img/newlogo.png");
            conn = url.openConnection();
            size = conn.getContentLength();
            System.out.println(size > 0 ? "文件大小:" + size+" bytes" : "");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            conn.getInputStream().close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

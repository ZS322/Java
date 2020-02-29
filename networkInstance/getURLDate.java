package networkInstance;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

/**
 * 获取 URL响应头的日期信息
 */
public class getURLDate {

    public static void main(String[] args) throws Exception {

        URL url = new URL("https://www.runoob.com/java/net-url-header.html");
        HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
        long date = httpCon.getDate();

        if (date == 0) {
            System.out.println("无法获取信息。");
        } else {
            System.out.println("Date: " + new Date(date));
        }

    }

}

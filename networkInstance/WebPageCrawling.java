package networkInstance;

import java.io.*;
import java.net.URL;

/**
 * 网页抓取
 */
public class WebPageCrawling {

    public static void main(String[] args) throws Exception {

        URL url =new URL("https://www.runoob.com/java/net-webpage.html");

        InputStream inputStream = url.openStream();

        BufferedReader reader=new BufferedReader(new InputStreamReader(inputStream));

        BufferedWriter writer=new BufferedWriter(new FileWriter("C:\\learning\\data.txt"));

        String line;

        while ((line = reader.readLine()) != null) {

            System.out.println(line);

            writer.write(line);
            writer.newLine();

        }
        writer.close();
        reader.close();
        inputStream.close();

    }

}

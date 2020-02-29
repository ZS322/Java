package stringAndMethodDemo;

public class StringDemoOne {
    public static void main(String[] args) {

        /**char数组作为字符串的参数*/
        char[] charArray = {'z', 'h', 'i', 's'};
        String strArray = new String(charArray);    /**创建一个String类*/
        System.out.println(strArray);


        String site = "github.com";
        int len = site.length();      /**返回字符串的索引值*/
        System.out.println(len);

        String zhiShi = "直视".concat("ZhiShi");  /**拼接字符串  将指定字符串连接到此字符串的结尾  */
        System.out.println(zhiShi);

        /**+操作符连接*/
        String name = "jun" + "ge";
        System.out.println(name);

        /**String usually method*/
        String target="ZhiShi";

        /**返回追定索引的char值*/
        char hStr = target.charAt(0);
        System.out.println(hStr);

    }
}

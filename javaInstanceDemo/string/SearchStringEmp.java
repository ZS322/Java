package javaInstanceDemo.string;

public class SearchStringEmp {

    //字符串搜索
    public static void main(String[] args) {

        String str="Hello";

        int intIndex = str.indexOf("o");

        if(intIndex==-1){
            System.out.println("没有找到字符串");
        }else{
            System.out.println("位置"+intIndex);
        }

    }

}

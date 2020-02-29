package leetCodeDemo;

public class Test2 <T>{

    private T data;
    private T next;

    Test2(){
        System.out.println("创建了泛型类T");
    }

    Test2(T next){
        this.next=next;
    }

    public void setData(T data){
        this.data=data;
    }

    public T getData(){
        return this.data;
    }

}

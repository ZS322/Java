package genericsDemo;

/**
 * 泛型类
 * @param <T>
 */
public class Box<T> {

    private T t;

    public void add (T t){
        this.t=t;
    }

    public T get(){
        return t;
    }


}

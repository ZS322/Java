package datastructureInstance;

public class StackInstance {

    private int maxSize;
    private long[] stackArray;
    private int top;

    public StackInstance(int s) {
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }

    public void push(long j) {
        stackArray[++top] = j;
    }

    public static void main(String[] args) {

    }

}

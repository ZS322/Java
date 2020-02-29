package arrayListTwo;

/**
 * 队列的实现
 * 先进先出的线性表（FIFO）
 */
public class QueueImpl {

    private int maxSize;    //指定队列的容量
    private int[] queueArr; //队列存储数据的数组
    private int queueHead;  //队头：队列中指定了用来删除数据的一端
    private int queueFoot;  //队尾：队列中指定了用来插入数据的一端

    public QueueImpl(int maxSize) {
        this.maxSize = maxSize;
        queueArr = new int[maxSize];
        queueHead = -1;
        queueFoot = -1;
    }

    //判断队列是否满了
    public boolean isFull() {
        return queueFoot == maxSize - 1;
    }

    //判断队列是否为空
    public boolean isEmpty() {
        return queueHead == queueFoot;
    }

    //入队
    public void addQueue(int element) {

        if (isFull()) {
            System.out.println("满了");
            return;
        }
        queueFoot++;
        queueArr[queueFoot] = element;
    }

    //出队
    public int getQueue() {

        if (isEmpty()) {
            throw new RuntimeException("为空");
        }
        queueHead++;
        return queueArr[queueHead];
    }

    //展示队列元素
    public void showQueue(){
        if (isEmpty()) {

            System.out.println("为空");
            return;
        }
        for(int i=0;i<queueArr.length;i++){
            System.out.print(queueArr[i]);
        }
    }

    //取队头
    public int headQueue(){
        if (isEmpty()) {
            throw new RuntimeException("为空");
        }
        return queueArr[queueHead+1];
    }

}

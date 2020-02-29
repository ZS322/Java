package threadInstance;

public class TestThreadOne implements Runnable {

    private Thread t;
    private String threadName;

    TestThreadOne(String threadName){
        this.threadName=threadName;
    }

    @Override
    public void run() {
        try {
            for (int i = 4; i > 0; i--) {
                Thread.sleep(1000);
                System.out.println(threadName);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void start(){

        t=new Thread(this,threadName);
        t.start();
    }

    public static void main(String[] args) {

        TestThreadOne tOne = new TestThreadOne("threadOne");
        tOne.start();
        TestThreadOne tTwo = new TestThreadOne("threadTwo");
        tTwo.start();
    }

}

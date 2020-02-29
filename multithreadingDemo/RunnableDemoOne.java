package multithreadingDemo;

class RunnableDemo implements Runnable{

    private Thread t;
    private String threadName;

    RunnableDemo(String name){

        threadName=name;
        System.out.println("Creating"+threadName);
    }


    public void run() {

        System.out.println("Running");

        for(int i=4;i>0;i--){
            System.out.println(threadName);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void start(){

        System.out.println("Staring"+threadName);
        if(t==null){

            t=new Thread(this,threadName);
            t.start();
        }

    }


}


public class RunnableDemoOne {


    public static void main(String[] args) {



    }

}

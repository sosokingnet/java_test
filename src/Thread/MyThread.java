package Thread;

/**
 * Created by Administrator on 2018/9/1.
 */
class MyThread1 extends Thread {
    @Override
    public void run(){
        try {
            for(int i=0;i<10;i++){
                int time = (int)(Math.random()*1000);
                Thread.sleep(time);
                System.out.println("run=" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

public class MyThread{
    public static void main(String [] args){
        try {
            MyThread1 thread = new MyThread1();
            thread.setName("myThread");
            thread.start();
//            thread.join();   //加上join之后，main的线程执行会等待子线程执行完毕才能结束；
            for(int i=0; i<10; i++){
                int time = (int) (Math.random() * 1000);
                Thread.sleep(100);
                System.out.println("main=" + Thread.currentThread().getName());
            }
//            thread.join();   //放在这里，也是main的循环结束之后
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

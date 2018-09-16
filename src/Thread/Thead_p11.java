package Thread;

/**
 * Created by Administrator on 2018/9/1.
 */
class Mythread extends Thread{
    private int count = 5;
    @Override
    public void run(){
        super.run();
        count--;   //
        System.out.println(" Thread : "+ this.currentThread().getName() + " count = "+ count);
    }
}
public class Thead_p11 {
    public static void main( String[] args){
        Mythread mythread = new Mythread();
        Thread t1 = new Thread(mythread,"A");
        Thread t2 = new Thread(mythread,"B");
        Thread t3 = new Thread(mythread,"C");
        Thread t4 = new Thread(mythread,"D");
        Thread t5 = new Thread(mythread,"E");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
// 希望输出下面的结果，但是由于这片代码并非线程安全的，运行时候count--会出现重复更新的问题；
//        Thread : A count = 4
//        Thread : C count = 3
//        Thread : B count = 2
//        Thread : D count = 1
//        Thread : E count = 0

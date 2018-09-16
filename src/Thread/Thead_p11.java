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
// ϣ���������Ľ��������������Ƭ���벢���̰߳�ȫ�ģ�����ʱ��count--������ظ����µ����⣻
//        Thread : A count = 4
//        Thread : C count = 3
//        Thread : B count = 2
//        Thread : D count = 1
//        Thread : E count = 0

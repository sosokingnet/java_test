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
//            thread.join();   //����join֮��main���߳�ִ�л�ȴ����߳�ִ����ϲ��ܽ�����
            for(int i=0; i<10; i++){
                int time = (int) (Math.random() * 1000);
                Thread.sleep(100);
                System.out.println("main=" + Thread.currentThread().getName());
            }
//            thread.join();   //�������Ҳ��main��ѭ������֮��
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

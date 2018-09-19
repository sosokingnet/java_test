package God.Std;

public class SingletonThreadSave1 {
    private static SingletonThreadSave1 singleton = null;
    // 声明，不创建，lazy模式
    private SingletonThreadSave1(){}
    synchronized static SingletonThreadSave1 getInstance(){  //加上 synchronized，虽然实现同步，但是性能不是最好，尤其是getInstance很大的时候，我们其实只需要针对判断和new做互斥即可
        if (singleton == null){
            singleton = new SingletonThreadSave1();
        }
        return singleton;
    }
    public static void doSomething(){
        //do something
    }
}

package God.Std;

public class Singleton {
    //饿汉模式的单例
    private static final Singleton singletom = new Singleton();
    //1、私有的一个final成员，单例的实例，饿汉模式；
    private Singleton(){}
   //2、不可以外部创建实例
    public static Singleton getInstance(){
        return singletom;
    }  //提供getInstance方法获取单例
    public static void doSomething() {
        //3、类中的其他方法，尽量是static；
    }
}

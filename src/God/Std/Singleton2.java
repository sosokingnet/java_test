package God.Std;

public class Singleton2 {
    //懒汉模式
    private static Singleton2 singleton = null;  //声明但是未初始化；
    private Singleton2(){}
    public Singleton2 getInstance(){
        if (singleton == null){  //使用到时才创建，lazy模式；  但是这个写法并非线程安全的；
            singleton = new Singleton2();
        }
        return singleton;
    }
}

package God.Std;

public class SingletonThreadSave2 {
    private static SingletonThreadSave2 singleton = null;
    //私有未创建
    private SingletonThreadSave2(){}  //私有掉，外部无法创建；
    public static SingletonThreadSave2 getInstance(){
        if (singleton == null ){
            synchronized (singleton) {   //这里其实无法保证不创建多个实例，多线程环境下；还是会冲突
               singleton = new SingletonThreadSave2();
            }
        }
        return singleton;
    }
}

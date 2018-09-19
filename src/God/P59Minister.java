package God;

class Emperor{
    private static final Emperor emperor = new Emperor();  //初始化一个皇帝，考虑只有一个皇帝的情况，设置是private和final；
    //这里是饿汉模式，线程安全；
    private Emperor (){}  // 私有的构造函数，不允许外部new
    public static Emperor getInstance(){
        return emperor;    //返回内部唯一的“单例”
    }
    public static void say(){
        System.out.println("我就是皇帝*****");
    }
}
public class P59Minister {
    //testing client
    public static void main(String[] args){
        for(int day=0;day<3;day++){
            Emperor emperor=Emperor.getInstance();   //get一个单例回来；
            emperor.say();
        }
    }
}
// 输出结果：
//我就是皇帝*****
//我就是皇帝*****
//我就是皇帝*****


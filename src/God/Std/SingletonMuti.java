package God.Std;

import java.util.ArrayList;

class Emperor{
    //1、区别：设置最大的对象实例个数，例如：3
    private static int maxNumOfEmperor = 3;
    //2、创建static的，存储实例的容器；不一定要ArrayList,其他容器也可以的
    private static ArrayList<String>  nameList = new ArrayList<String>();
    private Emperor(){}


}
public class SingletonMuti {
    public static void main(String[] args){
        return ;
    }
}

package God.Std;

import java.util.ArrayList;
import java.util.Random;

class Emperor{
    //1、区别：设置最大的对象实例个数，例如：3
    private static int maxNumOfEmperor = 3;
    //2、创建static的，存储实例的容器；不一定要ArrayList,其他容器也可以的
    private static ArrayList<String>  nameList = new ArrayList<String>(); //?这里为何要用个list，而不是每个对象自己记录呢？可以改善的
    //3、定义Emperor实例容器；
    private static ArrayList<Emperor> emperorList = new ArrayList<Emperor>();
    //指示当前的列表号
    private static int countNumOfEmperor = 0;

    static {
        for(int i=0;i<maxNumOfEmperor;i++) {
            emperorList.add(new Emperor("皇" + (i + 1) + "帝"));
        }
    }

    private Emperor(){}
    private Emperor(String name){
        nameList.add(name);
    }
    public static Emperor getInstance(){
        Random ran = new Random();
        //随机拉出一个皇帝
        countNumOfEmperor =  ran.nextInt(maxNumOfEmperor);
        return emperorList.get(countNumOfEmperor);
    }

    public static void say(){
        System.out.println(nameList.get(countNumOfEmperor));
    }
}
public class SingletonMuti {
    public static void main(String[] args){
        int ministerNum = 5;
        for(int i=0;i<ministerNum;i++){
            Emperor emperor = Emperor.getInstance();
            System.out.print("第"+ (i+1)+"个大臣参拜的是：");
            emperor.say();
        }
    }
}

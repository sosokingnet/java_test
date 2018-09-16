package Collection;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Administrator on 2018/8/22.
 */
public class tHashSet {
    public static void main(String[] args){
        // hashSet可以快速搜索内部的元素；
        Random random = new Random(47) ;
        Set<Integer> insert = new HashSet<Integer>();
        for(int i=0;i<100;i++){
            insert.add(random.nextInt(300));
        }
        System.out.println("size:" + insert.size() + ";" + insert);

        //注意打印的时候，是不会有重复的元素的，所以random.nextInt(参数越大，越不容易重复)
        //下面测试TreeSet的特性，是基本数据结构红黑树在java中的实现；

        Set<Integer> inTreeSet = new TreeSet<Integer>();
        for(int i=0;i<100;i++){
            inTreeSet.add(random.nextInt(2000));
        }
        System.out.println("size:" + inTreeSet.size() + ";" + inTreeSet);

        //打印全部的set
        for(Integer i:inTreeSet){
            System.out.print(i + ";");
        }
    }
}

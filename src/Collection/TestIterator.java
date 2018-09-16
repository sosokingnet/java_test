package Collection;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Administrator on 2018/8/22.
 */
public class TestIterator {
    public static void main(String[] args){
        ArrayList<String> arlist = new ArrayList<String>();
        arlist.add("1");
        arlist.add("2");
        arlist.add("no message");

        Iterator<String> iter = arlist.iterator();
        while (iter.hasNext()){
            String s = iter.next();  //获取当前游标上的值，并且移动游标到下一个元素；
            System.out.println(s);
        }
        //从容器里面获取一个数组打印；
        Object[] objArr = arlist.toArray();
        for(int i=0;i<objArr.length;i++){
            System.out.println(objArr[i]);
        }


    }
}

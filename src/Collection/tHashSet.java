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
        // hashSet���Կ��������ڲ���Ԫ�أ�
        Random random = new Random(47) ;
        Set<Integer> insert = new HashSet<Integer>();
        for(int i=0;i<100;i++){
            insert.add(random.nextInt(300));
        }
        System.out.println("size:" + insert.size() + ";" + insert);

        //ע���ӡ��ʱ���ǲ������ظ���Ԫ�صģ�����random.nextInt(����Խ��Խ�������ظ�)
        //�������TreeSet�����ԣ��ǻ������ݽṹ�������java�е�ʵ�֣�

        Set<Integer> inTreeSet = new TreeSet<Integer>();
        for(int i=0;i<100;i++){
            inTreeSet.add(random.nextInt(2000));
        }
        System.out.println("size:" + inTreeSet.size() + ";" + inTreeSet);

        //��ӡȫ����set
        for(Integer i:inTreeSet){
            System.out.print(i + ";");
        }
    }
}

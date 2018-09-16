package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Administrator on 2018/8/22.
 */
public class tHashMap {
    public static void  main(String[] args){
//        Map<String,String> pets = new TreeMap<String,String>();
        Map<String,String> pets = new HashMap<String,String>();
        pets.put("1","Pets Jack");
        pets.put("2","names herry");
        pets.put("3","Lucy");
        if(pets.containsKey("1")){
            System.out.println("Map pets contains Key : 1");
        }
    }
}

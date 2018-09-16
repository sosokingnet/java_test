/**
 * Created by Administrator on 2018/8/4.
 */
public class MathTest {
    static public void main(String[] args){
        System.out.println(Math.round(11.5));
        System.out.println(Math.round(-11.5));

        String s1 = "Programming";
        String s2 = new String("Programming");
        String s3 = "Program" + "ming";
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s1.intern());
    }
}

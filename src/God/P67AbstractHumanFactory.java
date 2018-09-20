package God;

interface Human{
    //每个人的肤色各异
    public void getColor();
    //各种人会说话
    public void talk();
}
// 声明多个产品，提供给工厂创建的产品列表
class BlackHuman implements Human{
    public void getColor(){
        System.out.println("黑色人种，皮肤是黑色");
    }
    public void talk(){
        System.out.println("黑人说话了");
    }
}

class YellowHuman implements Human{
    public void getColor(){
        System.out.println("Yellow色人种，皮肤是黑色");
    }
    public void talk(){
        System.out.println("Yellow人说话了");
    }
}

class WriteHuman implements Human{
    public void getColor(){
        System.out.println("Write色人种，皮肤是黑色");
    }
    public void talk(){
        System.out.println("Write人说话了");
    }
}

//抽象工厂类
abstract class AbstractHumanFactory{
    //声明返回Human子类的工厂创建方法
    public abstract <T extends Human> T createHuman(Class<T> c );
    //也可以通过字符串来标示需创建什么样的产品
//    public abstract <T extends Human> T createHuman(String className);
}
class HumanFactory extends AbstractHumanFactory {
    public <T extends Human> T createHuman(Class<T> c) {
        //工厂的实现方法，产生一个产品Human
        Human human = null;
        try {
            //尝试创建一个人类
            human = (T) Class.forName(c.getName()).newInstance();
        } catch (ClassNotFoundException e) {
            System.out.println("传入的类找不到，无法创建");
        } catch (Exception e) {
            System.out.println("HumanFactory创建人类出Exp");
        }
        //** 注意这里需强制转换然后再返回？
        return (T) human;
    }
}
public class P67AbstractHumanFactory {
    public static void main(String [] args){
        //声明一个工厂
        AbstractHumanFactory humanFactory = new HumanFactory();
        //1、创建一个白人
        Human writeHuman = humanFactory.createHuman(WriteHuman.class);
        writeHuman.getColor();
        writeHuman.talk();
        //2、再来创建一个黑人
        Human blackHuman = humanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        //3、继续创建一个黄种人
        Human yellowHuman = humanFactory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}

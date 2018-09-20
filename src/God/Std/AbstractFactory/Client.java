package God.Std.AbstractFactory;

//测试类
public class Client {
    public static void  main(String[] args){
        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct(ConcreteProduct2.class);
        //完成创建
    }
}

package God.Std.AbstractFactory;

public class ConcreteCreator extends Creator{
    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        //先声明返回的对象为null，注意return时，要转换成子类
        Product product = null;
        try {
            product = (Product)Class.forName(c.getName()).newInstance();
        }catch (Exception e){
            //处理创建异常，例如ClassNotFound
        }
        return (T)product;   //注意product是抽象接口对象，要转换类型为其子类，再返回
    }
}

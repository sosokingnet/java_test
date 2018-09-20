package God.Std.AbstractFactory;

public abstract class Creator {
    // 抽象工厂，输入参数可以自行设置，String、Enum、Class等
    public abstract <T extends Product> T createProduct(Class<T> c);
}

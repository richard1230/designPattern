package createBuildPattern.SingletonPattern.singleNonThread;


public final class Singleton {
    //私有静态变量用于保存单例实例
    private static Singleton instance;
    public String value;

    //构造函数设为私有
    private Singleton(String value) {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    //新建的一个静态构造方法
    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}

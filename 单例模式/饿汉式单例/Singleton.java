/**
 * Created with IntelliJ IDEA.
 * User: 刘莉慧
 * Date: 2018/7/24
 * Time: 21:40
 * To change this template use File | Settings | File Templates.
 */
public class Singleton {
    private Singleton(){}
    public static final Singleton singleton = new Singleton();

    public Singleton getSingleton(){
        return singleton;
    }
}

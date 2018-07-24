/**
 * Created with IntelliJ IDEA.
 * User: 刘莉慧
 * Date: 2018/5/20
 * Time: 12:30
 * To change this template use File | Settings | File Templates.
 */
public abstract class Decorator extends Coffee{
    protected Coffee mCoffee;

    /**
     * 通过组合的方式把Coffee对象传递进来
     * @param coffee
     */
    public Decorator(Coffee coffee){
        mCoffee=coffee;
    }
}

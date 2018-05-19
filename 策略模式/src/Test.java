import implemet.impl.FlyNoWay;

/**
 * Created with IntelliJ IDEA.
 * User: 刘莉慧
 * Date: 2018/5/19
 * Time: 10:06
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.performfly();
        duck.setFlyBrhavior(new FlyNoWay());
        duck.performfly();
    }
}
import implemet.impl.FlyWithWing;
import implemet.impl.Quack;

/**
 * Created with IntelliJ IDEA.
 * User: 刘莉慧
 * Date: 2018/5/19
 * Time: 10:02
 * To change this template use File | Settings | File Templates.
 */
public class MallardDuck extends Duck {
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBrhavior = new FlyWithWing();
    }

    @Override
    public void display() {
        System.out.println("I'm real MallardDuck");
    }

}

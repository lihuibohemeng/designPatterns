import implemet.FlyBrhavior;
import implemet.QuackBehavior;

/**
 * Created with IntelliJ IDEA.
 * User: 刘莉慧
 * Date: 2018/5/19
 * Time: 9:45
 * To change this template use File | Settings | File Templates.
 */
public abstract class Duck {

    QuackBehavior quackBehavior;
    FlyBrhavior flyBrhavior;

    public abstract void display();
    public void performQuack(){
        quackBehavior.quack();
    }
    public void performfly(){
        flyBrhavior.fly();
    }
    public void swim(){
        System.out.println("All fucks float");
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBrhavior(FlyBrhavior flyBrhavior) {
        this.flyBrhavior = flyBrhavior;
    }
}

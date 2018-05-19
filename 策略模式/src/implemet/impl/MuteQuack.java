package implemet.impl;

import implemet.QuackBehavior;

/**
 * Created with IntelliJ IDEA.
 * User: 刘莉慧
 * Date: 2018/5/19
 * Time: 9:52
 * To change this template use File | Settings | File Templates.
 */
public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Slience");
    }
}

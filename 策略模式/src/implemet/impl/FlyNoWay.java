package implemet.impl;

import implemet.FlyBrhavior;

/**
 * Created with IntelliJ IDEA.
 * User: 刘莉慧
 * Date: 2018/5/19
 * Time: 9:50
 * To change this template use File | Settings | File Templates.
 */
public class FlyNoWay implements FlyBrhavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}

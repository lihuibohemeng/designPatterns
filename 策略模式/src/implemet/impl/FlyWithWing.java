package implemet.impl;

import implemet.FlyBrhavior;

/**
 * Created with IntelliJ IDEA.
 * User: 刘莉慧
 * Date: 2018/5/19
 * Time: 9:49
 * To change this template use File | Settings | File Templates.
 */
public class FlyWithWing implements FlyBrhavior{

    @Override
    public void fly() {
        System.out.println("I'm Flying");
    }
}

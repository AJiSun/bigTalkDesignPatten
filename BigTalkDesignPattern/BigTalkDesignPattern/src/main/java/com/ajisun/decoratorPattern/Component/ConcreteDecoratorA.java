package main.java.com.ajisun.decoratorPattern.Component;

/**
 * Project Name:BigTalkDesignPattern
 * Package Name:main.java.com.ajisun.decoratorPattern.Component
 * Date:2017/11/26
 * Create By:AJiSun
 */

public class ConcreteDecoratorA extends Decorator {

    //本类独有的功能，以区别ConcreteDecoratorB
    private String addedState;


    /*
    * 首先运行原有的Component的Operation()
    * 再执行本类的功能，如addedState,相当于对原Component进行了装饰
    * */
    @Override
    public void Operation() {
        super.Operation();
        addedState = "New State";
        System.out.println("操作类A");
    }
}

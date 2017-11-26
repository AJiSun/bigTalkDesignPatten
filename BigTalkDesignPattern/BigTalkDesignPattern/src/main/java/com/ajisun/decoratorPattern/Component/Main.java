package main.java.com.ajisun.decoratorPattern.Component;

/**
 * Project Name:BigTalkDesignPattern
 * Package Name:main.java.com.ajisun.decoratorPattern.Component
 * Date:2017/11/26
 * Create By:AJiSun
 */

public class Main {
    public static void main(String[] args){
        /**
         * 装饰方法是：
         * 首先用ConcreteComponent 实例化对象c，
         * 然后用ConcreteDecoratorA的实例化对象ca来保证c
         * 再用ConcreteDecoratorB 的对象cb包装ca
         * 最终执行cb的Operation()
         */

        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA ca = new ConcreteDecoratorA();
        ConcreteDecoratorB cb = new ConcreteDecoratorB();

        ca.setComponent(c);
        cb.setComponent(ca);
        cb.Operation();



    }
}

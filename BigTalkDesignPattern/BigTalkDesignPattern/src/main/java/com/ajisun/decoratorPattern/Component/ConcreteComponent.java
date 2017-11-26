package main.java.com.ajisun.decoratorPattern.Component;

/**
 * Project Name:BigTalkDesignPattern
 * Package Name:main.java.com.ajisun.decoratorPattern.Component
 * Date:2017/11/26
 * Create By:AJiSun
 */

public class ConcreteComponent implements Component {
    @Override
    public void Operation() {
        System.out.println("LOVE的表达");
    }
}

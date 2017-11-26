package main.java.com.ajisun.decoratorPattern.Component;

/**
 * Project Name:BigTalkDesignPattern
 * Package Name:main.java.com.ajisun.decoratorPattern.Component
 * Date:2017/11/26
 * Create By:AJiSun
 */

public abstract class Decorator implements Component {
    private Component component;

    // 设置Component
    public void setComponent(Component component){
        this.component = component;
    }

    // 重写Operation() 实际上执行的是Component的Operation()
    @Override
    public void Operation() {
        if (component != null){
            component.Operation();
        }
    }
}

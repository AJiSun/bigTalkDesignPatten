package main.java.com.ajisun.strategyPattern;

/**
 * Project Name:BigTalkDesignPattern
 * Package Name:main.java.com.ajisun.strategyPattern
 * Date:2017/8/4
 * Create By:ajisun
 */

public class ClientTest {

    public static void main(String[] args){
        Context context ;
        System.out.println("--------执行策略算法A-----------");
        context = new Context(new ConcreteStrategyA());
        context.ContextInterface();

        System.out.println("---------执行策略算法B---------");
        context = new Context(new ConcreteStrategyB());
        context.ContextInterface();

    }
}

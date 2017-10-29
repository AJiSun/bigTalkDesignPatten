package main.java.com.ajisun.strategyPattern;

/**
 * Project Name:BigTalkDesignPattern
 * Package Name:main.java.com.ajisun.strategyPattern
 * Date:2017/8/4
 * Create By:ajisun
 */


/*
* 封装了具体算法或行为  继承于Strategy
*
* 算法B
* */
public class ConcreteStrategyB implements Strategy {
    @Override
    public void AlgorithmInterface() {
        System.out.println("算法B 实现");
    }
}

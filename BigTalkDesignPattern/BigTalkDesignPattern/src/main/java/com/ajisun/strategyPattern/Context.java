package main.java.com.ajisun.strategyPattern;

/**
 * Project Name:BigTalkDesignPattern
 * Package Name:main.java.com.ajisun.strategyPattern
 * Date:2017/8/4
 * Create By:ajisun
 */


/*
* 此类用于规范调用，维护一个对Strategy对象的引用
*
* 上下文
* */
public class Context {
    Strategy strategy;

    //初始化时，传入具体的策略对象
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    //上下文接口
    // 根据具体的策略对象，调用其算法的方法
    public void ContextInterface(){
        strategy.AlgorithmInterface();
    }


}

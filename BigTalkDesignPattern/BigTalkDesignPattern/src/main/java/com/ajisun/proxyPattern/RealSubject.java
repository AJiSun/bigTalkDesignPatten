package main.java.com.ajisun.proxyPattern;

/**
 * Project Name:BigTalkDesignPattern
 * Package Name:main.java.com.ajisun.proxyPattern
 * Date:2017/12/3
 * Create By:ajisun
 */

/*
* 定义ProxySubject所代表的真实实体
* */
public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("真实的请求");
    }
}

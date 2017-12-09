package main.java.com.ajisun.proxyPattern;

/**
 * Project Name:BigTalkDesignPattern
 * Package Name:main.java.com.ajisun.proxyPattern
 * Date:2017/12/3
 * Create By:ajisun
 */


/*
* 定义RealSubject和ProxySubject共用的接口，
* 这样就在任何使用RealSubject的地方都可以使用ProxySubject
*
* */
public interface Subject {
    public abstract void request();
}

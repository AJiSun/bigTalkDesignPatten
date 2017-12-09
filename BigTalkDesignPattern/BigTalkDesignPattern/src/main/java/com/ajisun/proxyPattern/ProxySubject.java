package main.java.com.ajisun.proxyPattern;

/**
 * Project Name:BigTalkDesignPattern
 * Package Name:main.java.com.ajisun.proxyPattern
 * Date:2017/12/3
 * Create By:ajisun
 */

/*
* 保存一个引用使得代理可以访问实体，
* 并提供一个与Subject的接口相同的接口，这样代理就可以用来替代实体
* */
public class ProxySubject implements Subject {

    RealSubject realSubject ;

    @Override
    public void request() {
        if (realSubject==null){
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}

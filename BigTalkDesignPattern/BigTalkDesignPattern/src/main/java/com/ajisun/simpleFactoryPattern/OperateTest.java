package main.java.com.ajisun.simpleFactoryPattern;

/**
 * Copyright (c) 2017.
 * Project Name:BigTalkDesignPattern
 * Package Name:main.java.com.ajisun.simpleFactoryPattern
 * Date:2017/7/9
 * Create By:ajisun
 */

public class OperateTest {

    public static void main(String[] args) throws Exception{
        Operation operation = null;
        operation = OperationFactory.createOperate(OperationFactory.OperateEnum.mul);
        operation.setNumberB(2.9);
        operation.setNumberA(2.1);
        System.out.println("运行结果："+operation.getResult());
    }


}

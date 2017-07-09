package main.java.com.ajisun.simpleFactoryPattern;

/**
 * Copyright (c) 2017. Hand Enterprise Solution Company. All right reserved.
 * Project Name:BigTalkDesignPattern
 * Package Name:main.java.com.ajisun.simpleFactoryPattern
 * Date:2017/7/9
 * Create By:ajisun
 */

public class OperationFactory {

    public   enum OperateEnum{
        add,sub,mul,div;
    }

//    利用多态根据操作实例化对象
    public static Operation createOperate(OperateEnum oe){
        Operation operation = null;
        switch (oe){
            case  add:
                operation = new OperateAdd();
                break;
            case sub:
                operation = new OperateSub();
                break;
            case mul:
                operation = new OperateMul();
                break;
            case div:
                operation = new OperateDiv();
                break;
        }

        return operation;
    }


}

package com.solvo.newdllib.dynamicload.service;
/**
 * 业务接口，为了不增加新的工程，所以先定义在插件LIB里面，
 * 客户可以根据业务需求定义Service的接口
 * @author zhangjie
 *
 */
public interface ITestServiceInterface {
    int sum(int a, int b);
}

package com.dynamic;

/**
 * @program: learn-demo
 * @description:
 * @author: LWB
 * @create: 2019-08-31 16:18
 **/
public class Client {
    public static void main(String[] args) {
        ITeacherDao target = new TeacherDao();

        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();

//        System.out.println("proxyInstance==" + proxyInstance.getClass());


        proxyInstance.teach();
    }

}

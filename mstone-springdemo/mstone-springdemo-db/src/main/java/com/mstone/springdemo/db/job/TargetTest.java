package com.mstone.springdemo.db.job;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description:
 * @author: fisher
 * @create: 2019-10-30 13:56
 */
public class TargetTest {

    public static void main(String[] args) {
        new TargetTest().test();
    }

    public void test() {

        MyJob myJob = new MyJobImpl();

        InvocationHandler handler = new MyJobPorxy(myJob);
        MyJob targetObject = (MyJob) Proxy.newProxyInstance(handler.getClass().getClassLoader(), myJob.getClass().getInterfaces(), handler);

        targetObject.execute();
    }


    public interface MyJob {
        void execute();
    }

    public class MyJobImpl implements MyJob{

        @Override
        public void execute() {
            System.out.println("execute job...");
        }
    }

    public class MyJobPorxy implements InvocationHandler {

        private Object object;

        public MyJobPorxy(Object object) {
            this.object = object;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("begin execute ...");

            Object result = method.invoke(object, args);

            System.out.println("end execute....");

            return result;
        }
    }
}
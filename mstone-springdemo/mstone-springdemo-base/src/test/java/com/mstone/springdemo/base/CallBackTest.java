package com.mstone.springdemo.base;

/**
 * @description:
 * @author: fisher
 * @create: 2019-10-31 11:52
 */
public class CallBackTest {


    public static void main(String[] args) {

        People people = new Student();
        CallBackTest test = new CallBackTest();
        test.aa(people);
    }

    public void aa(People people) {

        people.say();
    }


}

interface People {
    void say();
}

class Student implements People {

    @Override
    public void say() {
        System.out.println("stu");
    }
}
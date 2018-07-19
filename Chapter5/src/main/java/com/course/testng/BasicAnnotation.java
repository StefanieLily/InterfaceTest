package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    @Test
    public void testCase1(){
        long id = Thread.currentThread().getId();
        System.out.println("Test这是测试用例1" + id);
    }

    @Test
    public void testCase2(){
        long id = Thread.currentThread().getId();
        System.out.println("Test这是测试用例2" + id);
    }
    @BeforeMethod
    public void beforeMethod(){
        long id = Thread.currentThread().getId();
        System.out.println("BeforeMethod这是在测试方法之前运行的！" + id);
    }

    @AfterMethod
    public void afterMethod(){
        long id = Thread.currentThread().getId();
        System.out.println("AfterMethod这是在测试方法之后运行的！" + id);
    }

    @BeforeClass
    public void beforeClass(){
        long id = Thread.currentThread().getId();
        System.out.println("BeforeClass这是在类运行之前运行的！" + id);
    }

    @AfterClass
    public void afterClass(){
        long id = Thread.currentThread().getId();
        System.out.println("AfterClass这是在类运行之后运行的！" + id);
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite测试套件！");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite测试套件！");
    }
}

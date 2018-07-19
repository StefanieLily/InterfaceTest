package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass2 {

    public void stu1(){
        System.out.println("GroupsOnClass22222中得stu1111运行");
    }

    public void stu2(){
        System.out.println("GroupsOnClass22222中得stu2222运行");
    }
}

package com.automation.testcases;

import org.testng.annotations.Test;

public class PriorityDependency {
    @Test(priority = 1)
    public void test1(){
        System.out.println("Test1");
    }
    @Test(dependsOnMethods = "test1")
    public void test2(){
        System.out.println("Test2");
    }
    @Test(priority = 3)
    public void test3(){
        System.out.println("Test3");
    }
    @Test(dependsOnMethods = "test5")
    public void test4(){
        System.out.println("Test4");
    }
    @Test(priority = 5)
    public void test5(){
        System.out.println("Test5");
    }

}

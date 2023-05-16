package com.automation.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertHardAssert {
    @Test
    public void testSoftAssert(){
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(2,2);
        sa.assertEquals("Chirag","Chriag");
        sa.assertEquals(10,10);
        sa.assertAll();//Gives info regarding failed tests
        System.out.println("Soft Assert Test Ends");
    }
    @Test
    public void testHardAssert(){
        Assert.assertEquals(2,2);
        Assert.assertEquals("Chirag","Chira");
        Assert.assertEquals(true,true);
        System.out.println("Hard Assert test ends");
    }
}

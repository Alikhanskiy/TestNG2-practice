package com.automation.testcases;

import org.testng.annotations.Test;

public class CartPageTest extends BaseTest{
    @Test
    public void verifyToAddInTheCart(){
        System.out.println("Added to cart");
    }
    @Test(groups = "Chirag Test")
    public void verifyToGetMessage(){
        System.out.println("Received Message");
    }
    @Test
    public void verifyToCheckOutWithCart(){
        System.out.println("Check out");
    }
}

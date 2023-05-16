package com.automation.testcases;

import org.testng.annotations.Test;

public class SearchFunctionalityTest extends BaseTest{
    public void verifyNoResultMessage(){
        System.out.println("No result message");
    }
    @Test(groups = "Smoke Test")
    public void verifySearchResultHasSearchKeyword(){
        System.out.println("Search result has search keyword");
    }
    public void verifySearchResult(){
        System.out.println("Search result");
    }
}

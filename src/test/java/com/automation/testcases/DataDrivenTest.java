package com.automation.testcases;

import com.ebay.LoginFeatures;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest {
     LoginFeatures lf = new LoginFeatures();
     @Test(dataProvider = "invalidData")
     public void verifyLoginUnsuccessfulWithInvalidCredentials(String username,String password){
         boolean result = lf.doLogin(username,password);
         Assert.assertEquals(result,false);
     }
     @DataProvider(name = "invalidData")
     public Object[][] getInvalidData(){
         String[][]credentials ={
                 {"Admin","admin@123"},
                 {"admin123","admin@123"},
                 {"admin","admin@122"},
                 {"adminMonday","admin@123"},
                 {"aDmin","admin@211"},
                 {"Chira","admin@123"},
                 {"","admin@111"},
                 {"",""},

         };
         return credentials;
     }
     @Test
     public void verifyLoginWithValidCredentials(){
         String username = "Admin",password = "admin@123";
         boolean result = lf.doLogin(username,password);
         Assert.assertEquals(result,true);
     }

}

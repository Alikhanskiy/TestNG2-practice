package com.ebay;

public class LoginFeatures {
    String validUsername = "Admin";
    String validPassword = "admin@123";
    public boolean doLogin(String username,String password){
        if(username.equals(validUsername) && password.equals(validPassword)){
            return true;
        }
        return false;
    }
}

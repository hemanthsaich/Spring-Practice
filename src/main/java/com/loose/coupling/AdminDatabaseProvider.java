package com.loose.coupling;

public class AdminDatabaseProvider implements UserDataProvider{

    @Override
    public String getUserDetails(){
        return "Admin details has been shared";
    }
}

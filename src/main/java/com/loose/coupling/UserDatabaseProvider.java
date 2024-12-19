package com.loose.coupling;

public class UserDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails(){
        //Directly access database here
        return "User details from database by using loose coupling";
    }
}

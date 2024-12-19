package com.loose.coupling;

public class UserWebserviceProvider implements UserDataProvider{

    @Override
    public String getUserDetails(){
        return "Fetching webserver for query";
    }
}

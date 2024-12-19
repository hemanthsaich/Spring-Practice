package com.loose.coupling;

public class LooseCouplingExample {

    public static void main(String[] args) {
        // object of interface and assigning object of class
        UserDataProvider databaseProvider1 = new UserDatabaseProvider();
        UserManager userManagerWithDB = new UserManager(databaseProvider1);
        System.out.println(userManagerWithDB.getUserInfo());

        // object of interface and assigning object of class
        UserDataProvider databaseProvider2 = new UserWebserviceProvider();
        UserManager userManagerWithWS = new UserManager(databaseProvider2);
        System.out.println(userManagerWithWS.getUserInfo());

        // object of interface and assigning object of class
        UserDataProvider databaseProvider3 = new AdminDatabaseProvider();
        UserManager userManagerWithAdmin = new UserManager(databaseProvider3);
        System.out.println(userManagerWithAdmin.getUserInfo());



    }

}

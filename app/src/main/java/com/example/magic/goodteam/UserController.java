package com.example.magic.goodteam;

import android.content.Context;
import android.content.SharedPreferences;

public class UserController {

    SharedPreferences sharedPreferences ;
    SharedPreferences.Editor editor ;
    private static String Folder_Name = "FOLDER";
    private String Remember = "remember";
    private String Username = "username" ;
    private String Password ="passewrd";
    private String Id ="id" ;

    public UserController(Context context) {
        sharedPreferences = context.getSharedPreferences(Folder_Name ,Context.MODE_PRIVATE);
        editor = sharedPreferences.edit() ;
    }

    public void SaveData(User user){
        editor.putBoolean(Remember , true);
        editor.putString(Username,user.getLName());
        editor.putString(Password,user.getLPass());
        editor.putString(Id , String.valueOf(user.getLId()));
        editor.commit();
    }

    public boolean IsRemember (){

        if(sharedPreferences.getBoolean(Remember,false)){
            return true ;
        }
        else {
            return false ;
        }
    }

    public User GetData(){

        User user = new User();
        user.setLName(sharedPreferences.getString(Username,"none"));
        user.setLPass(sharedPreferences.getString(Password,"none"));
        user.setLId(sharedPreferences.getString(Id, "none"));
        return user ;
    }
}

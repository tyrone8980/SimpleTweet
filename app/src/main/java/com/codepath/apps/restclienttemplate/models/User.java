package com.codepath.apps.restclienttemplate.models;

import org.json.JSONException;
import org.json.JSONObject;

public class User {
    public String name;
    public long uid;
    public String screenname;
    public String Profilepicture;


    public static User fromJson(JSONObject jsonObject) throws JSONException {
        User user =  new User();
        user.name = jsonObject.getString("name");
        user.uid = jsonObject.getLong("id");
        user.screenname = jsonObject.getString("screen_name");
        user.Profilepicture = jsonObject.getString("profile_image_url");

        return user;
    }
}

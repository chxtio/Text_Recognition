package com.codepath.instagramclone;


import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Need to make sure to register this class with Parse before we call Parse.initialize
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("fBXPMhE1HflfiFnkcP1QoPyf4rLUCt5X4A0mtpmi")
                .clientKey("7I0Afkr2ioK8h3KVjdmyikI9ZCQVKXo6aUJDg6rZ")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}

package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("yvalMglTelin8JmVD4gfo71IDUadRuiQnrsmm8PB")
                .clientKey("8ZwrXvB5fHCQhAlBj1kdUljoJwKA3ogoafCmkYTp")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}

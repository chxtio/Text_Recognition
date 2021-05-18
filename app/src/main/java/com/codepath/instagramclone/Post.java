package com.codepath.instagramclone;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;

// Querying objects- Use Parse API to get data from database
@ParseClassName("Post") // Class name matches entity defined in Parse dashboard
public class Post extends ParseObject {
    public static final String KEY_DESCRIPTION = "description";
    public static final String KEY_IMAGE = "image";
    public static final String KEY_USER="user";
    public static final String KEY_CREATED_KEY = "createdAt";
    public static final String KEY_EXTRACTED = "extractedText";

    public String getDescription() {
        return getString(KEY_DESCRIPTION);
    }

    public void setDescription(String description) {
        put(KEY_DESCRIPTION, description);
    }

    public ParseFile getImage() {
        return getParseFile(KEY_IMAGE);
    }

    public void setImage(ParseFile parseFile) {
        put(KEY_IMAGE, parseFile);
    }

    public ParseUser getUser() {
        return getParseUser(KEY_USER);
    }

    public void setUser(ParseUser user) {
        put(KEY_USER, user);
    }

    public String getExtractedText() {
        return getString(KEY_EXTRACTED);
    }

    public void setExtractedText(String text) { put(KEY_EXTRACTED, text); }
}

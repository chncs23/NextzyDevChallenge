package io.github.chncs23.nextzydevchallenge.entity;

import java.util.ArrayList;

/**
 * Created by CHNCS23 on 23/10/2559.
 */

public class PostItem {
    private String title;
    private ArrayList<String> imageUrl;
    private String url;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(ArrayList<String> imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

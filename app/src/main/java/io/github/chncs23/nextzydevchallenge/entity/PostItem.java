package io.github.chncs23.nextzydevchallenge.entity;

import java.util.ArrayList;

/**
 * Created by CHNCS23 on 23/10/2559.
 */

public class PostItem {
    private String title;
    private ArrayList<Image> images;
    private String url;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Image> getImages() {
        return images;
    }

    public void setImages(ArrayList<Image> images) {
        this.images = images;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public class Image {
        private String url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}

package io.github.chncs23.nextzydevchallenge.entity;

import java.util.ArrayList;

/**
 * Created by CHNCS23 on 23/10/2559.
 */

public class PostDataSet {
    private ArrayList<PostItem> items;

    public ArrayList<PostItem> getPostItems() {
        return items;
    }

    public void setPostItems(ArrayList<PostItem> postItems) {
        this.items = postItems;
    }
}

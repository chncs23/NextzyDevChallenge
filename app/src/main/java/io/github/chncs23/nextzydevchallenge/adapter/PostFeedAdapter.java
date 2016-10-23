package io.github.chncs23.nextzydevchallenge.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.github.chncs23.nextzydevchallenge.R;
import io.github.chncs23.nextzydevchallenge.entity.PostDataSet;
import io.github.chncs23.nextzydevchallenge.entity.PostItem;
import java.util.ArrayList;

/**
 * Created by CHNCS23 on 23/10/2559.
 */

public class PostFeedAdapter extends RecyclerView.Adapter {
    public static final int NO_IMG_POST = 0;
    private PostDataSet postDataSet;
    private static final int IMG_POST = 1;

    public PostFeedAdapter(PostDataSet postDataSet) {
        this.postDataSet = postDataSet;
    }

    @Override public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        switch (viewType) {
            case IMG_POST:
                return new ImgPostHolder(from.inflate(R.layout.view_post_with_img, parent, false));
            case NO_IMG_POST:
                return new NoImgPostHolder(from.inflate(R.layout.view_post_without_img, parent, false));
            default:
                return new ImgPostHolder(from.inflate(R.layout.view_post_without_img, parent, false));
        }
    }

    @Override public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof ImgPostHolder) {
            ((ImgPostHolder) holder).setPostData(getPostItems().get(position));
        } else if (holder instanceof NoImgPostHolder) {
            ((NoImgPostHolder) holder).setPostData(getPostItems().get(position));
        }
    }

    private ArrayList<PostItem> getPostItems() {
        return postDataSet.getPostItems();
    }

    @Override public int getItemCount() {
        if (postDataSet == null) return 0;
        return getPostItems() == null ? 0 : getPostItems().size();
    }

    @Override public int getItemViewType(int position) {
        return getPostItems().get(position).getImageUrl() == null ? NO_IMG_POST : IMG_POST;
    }
}

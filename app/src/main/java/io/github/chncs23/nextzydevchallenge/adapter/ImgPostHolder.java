package io.github.chncs23.nextzydevchallenge.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import io.github.chncs23.nextzydevchallenge.R;
import io.github.chncs23.nextzydevchallenge.entity.PostItem;

/**
 * Created by CHNCS23 on 23/10/2559.
 */

public class ImgPostHolder extends RecyclerView.ViewHolder {
    private ImageView postImg;
    private TextView postTitle;

    public ImgPostHolder(View itemView) {
        super(itemView);
        postImg = (ImageView) itemView.findViewById(R.id.postImg);
        postTitle = (TextView) itemView.findViewById(R.id.postTitle);
    }

    public void setPostData(PostItem postItem) {
        Glide.with(postImg.getContext()).load(postItem.getImages().get(0).getUrl()).into(postImg);
        postTitle.setText(postItem.getTitle());
    }
}

package io.github.chncs23.nextzydevchallenge.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import io.github.chncs23.nextzydevchallenge.R;
import io.github.chncs23.nextzydevchallenge.entity.PostItem;

/**
 * Created by CHNCS23 on 23/10/2559.
 */

public class NoImgPostHolder extends RecyclerView.ViewHolder {

    private TextView postTitle;

    public NoImgPostHolder(View itemView) {
        super(itemView);
        postTitle = (TextView) itemView.findViewById(R.id.postTitle);
    }

    public void setPostData(PostItem postItem) {
        postTitle.setText(postItem.getTitle());
    }
}

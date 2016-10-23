package io.github.chncs23.nextzydevchallenge.service;

import io.github.chncs23.nextzydevchallenge.entity.PostDataSet;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by CHNCS23 on 23/10/2559.
 */

public interface PostInfoService {
    @GET("blogger/v3/blogs/blogId/posts")
    Call<PostDataSet> getPostInfo(@Query("key") String apiKey,
            @Query("blogId") String blogId,
            @Query("fetchImages") boolean needFetchImages,
            @Query("maxResults") int maxResults);
}

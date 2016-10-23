package io.github.chncs23.nextzydevchallenge;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;
import io.github.chncs23.nextzydevchallenge.adapter.PostFeedAdapter;
import io.github.chncs23.nextzydevchallenge.entity.PostDataSet;
import io.github.chncs23.nextzydevchallenge.service.HTTPManager;
import io.github.chncs23.nextzydevchallenge.service.PostInfoService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainActivity extends AppCompatActivity {

    private RecyclerView newsFeedListView;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        newsFeedListView = (RecyclerView) findViewById(R.id.newsFeedListView);
        newsFeedListView.setLayoutManager(new LinearLayoutManager(this));
        getPostData();
    }

    private void getPostData() {
        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setCancelable(false);
        progressDialog.setMessage("รอแป๊บนึง");
        progressDialog.show();

        Call<PostDataSet> postDataSetCall = HTTPManager.create(PostInfoService.class)
                .getPostInfo("AIzaSyBzL7-wKQl-bOHg7EyFxYrSWDrqIqGbt4Y", "2112378201659339351", true, 100);
        postDataSetCall.enqueue(new Callback<PostDataSet>() {
            @Override public void onResponse(Call<PostDataSet> call, Response<PostDataSet> response) {
                progressDialog.dismiss();
                if (!response.isSuccessful()) {
                    Toast.makeText(MainActivity.this, "Error 1", Toast.LENGTH_SHORT).show();
                }

                if (response.body() != null) {
                    Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
                    newsFeedListView.setAdapter(new PostFeedAdapter(response.body()));
                }
            }

            @Override public void onFailure(Call<PostDataSet> call, Throwable t) {
                progressDialog.dismiss();
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}


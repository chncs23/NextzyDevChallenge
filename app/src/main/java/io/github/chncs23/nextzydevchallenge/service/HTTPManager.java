package io.github.chncs23.nextzydevchallenge.service;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HTTPManager {

    private static HTTPManager instance;
    final private Retrofit retrofit;

    private HTTPManager() {
        final OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .build();

        retrofit = new Retrofit.Builder().baseUrl("https://www.googleapis.com")
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();
    }

    public static HTTPManager getInstance() {
        if (instance == null) instance = new HTTPManager();
        return instance;
    }

    public static <T> T create(Class<T> classT) {
        return getInstance().getRetrofit().create(classT);
    }

    private Retrofit getRetrofit() {
        return retrofit;
    }
}

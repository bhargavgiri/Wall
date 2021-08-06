package com.example.newwallpeparapi.WallpeparData;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {








public  static  WallpaperServise wallpaperServise=null;
public static  WallpaperServise getdata()
{
    HttpLoggingInterceptor loggingInterceptor=new HttpLoggingInterceptor();
    loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
    OkHttpClient client=new OkHttpClient.Builder().addInterceptor(loggingInterceptor)
            .connectTimeout(2, TimeUnit.MINUTES)
            .readTimeout(15,TimeUnit.SECONDS)
            .writeTimeout(15,TimeUnit.SECONDS)
            .build();
            wallpaperServise=new Retrofit.Builder()
                    .baseUrl("https://pexelsdimasv1.p.rapidapi.com/v1/")

                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client)
                    .build().create(WallpaperServise.class);
            return wallpaperServise;

}

}

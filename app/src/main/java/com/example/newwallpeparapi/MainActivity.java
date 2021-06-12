package com.example.newwallpeparapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.newwallpeparapi.WallpeparData.ApiClient;
import com.example.newwallpeparapi.WallpeparData.Photo;
import com.example.newwallpeparapi.WallpeparData.Src;
import com.example.newwallpeparapi.WallpeparData.WallpaperServise;
import com.example.newwallpeparapi.WallpeparData.WallpeparRoot;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WallpaperServise wallpaperServise= ApiClient.getdata();
        Call<WallpeparRoot> call=wallpaperServise.getimagelist();
        call.enqueue(new Callback<WallpeparRoot>() {
            @Override
            public void onResponse(Call<WallpeparRoot> call, Response<WallpeparRoot> response) {
            if (response.isSuccessful())
            {
                    WallpeparRoot root=response.body();
                List<Photo> photoList=root.getPhotos();
                for (int i=0;i<photoList.size();i++)
                {
                    Src large2x=photoList.get(i).getSrc();
                    String image=large2x.getLarge2x();
                    System.out.println(image);
                }
            }
            }

            @Override
            public void onFailure(Call<WallpeparRoot> call, Throwable t) {

            }
        });
    }
}
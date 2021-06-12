package com.example.newwallpeparapi.WallpeparData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface WallpaperServise {






   // @Headers({ "Content-Type: application/json;charset=UTF-8"})
   // @Headers({"Authorization","563492ad6f91700001000001f059a35a1228429cbdc60fefd656ec67"})
@GET("curated")
    Call<WallpeparRoot>getimagelist();
}

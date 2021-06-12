package com.example.newwallpeparapi.WallpeparData;

import java.util.List;

public class WallpeparRoot {
    public int page;
    public int per_page;
    public List<Photo> photos;
    public int total_results;
    public String next_page;

    public int getPage() {
        return page;
    }

    public int getPer_page() {
        return per_page;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public int getTotal_results() {
        return total_results;
    }

    public String getNext_page() {
        return next_page;
    }
}

package com.ekoramadhan.videoplayer.utils;

import com.ekoramadhan.videoplayer.models.VideoModel;

import java.util.List;


public class TempVideoList {
    private static TempVideoList instance;
    private List<VideoModel> data = null;

    protected TempVideoList() {

    }

    public static TempVideoList getInstance() {
        if (instance == null) {
            instance = new TempVideoList();
        }
        return instance;
    }

    public List<VideoModel> getData() {
        return data;
    }

    public void setData(List<VideoModel> data) {
        this.data = data;
    }
}

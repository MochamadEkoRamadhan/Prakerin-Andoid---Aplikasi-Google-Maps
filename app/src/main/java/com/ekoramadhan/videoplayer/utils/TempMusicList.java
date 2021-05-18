package com.ekoramadhan.videoplayer.utils;

import com.ekoramadhan.videoplayer.models.MusicModel;

import java.util.List;


public class TempMusicList {
    private static TempMusicList instance;
    private List<MusicModel> data = null;

    protected TempMusicList() {

    }

    public static TempMusicList getInstance() {
        if (instance == null) {
            instance = new TempMusicList();
        }
        return instance;
    }

    public List<MusicModel> getData() {
        return data;
    }

    public void setData(List<MusicModel> data) {
        this.data = data;
    }
}

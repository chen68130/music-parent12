package com.qf.pojo;

public class TbMusic {
    private String musicId;

    private String musicName;

    private String musicAlbumName;

    private String musicAlbumPicurl;

    private String musicMp3url;

    private String musicArtistName;

    private Integer sheetId;

    public String getMusicId() {
        return musicId;
    }

    public void setMusicId(String musicId) {
        this.musicId = musicId == null ? null : musicId.trim();
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName == null ? null : musicName.trim();
    }

    public String getMusicAlbumName() {
        return musicAlbumName;
    }

    public void setMusicAlbumName(String musicAlbumName) {
        this.musicAlbumName = musicAlbumName == null ? null : musicAlbumName.trim();
    }

    public String getMusicAlbumPicurl() {
        return musicAlbumPicurl;
    }

    public void setMusicAlbumPicurl(String musicAlbumPicurl) {
        this.musicAlbumPicurl = musicAlbumPicurl == null ? null : musicAlbumPicurl.trim();
    }

    public String getMusicMp3url() {
        return musicMp3url;
    }

    public void setMusicMp3url(String musicMp3url) {
        this.musicMp3url = musicMp3url == null ? null : musicMp3url.trim();
    }

    public String getMusicArtistName() {
        return musicArtistName;
    }

    public void setMusicArtistName(String musicArtistName) {
        this.musicArtistName = musicArtistName == null ? null : musicArtistName.trim();
    }

    public Integer getSheetId() {
        return sheetId;
    }

    public void setSheetId(Integer sheetId) {
        this.sheetId = sheetId;
    }
}
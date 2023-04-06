package day09.musicplayer;

import java.util.Arrays;

public class Singer {

    private String name; // 가수 이름

    private String[] songs; // 노래 목록

    public Singer(String name) {
        this.name = name;
        this.songs = new String[0];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSongs() {
        return songs;
    }

    public void setSongs(String[] songs) {
        this.songs = songs;
    }

    /**
     * 노래를 추가하는 메서드
     * @param newSong : 새로 추가할 노래
     */
    public void addSong(String newSong) {
        String[] temp = new String[songs.length + 1];

        System.arraycopy(songs, 0, temp, 0, songs.length);

        temp[songs.length] = newSong;
        songs = temp;
    }
}

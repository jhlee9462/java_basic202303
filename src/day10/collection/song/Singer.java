package day10.collection.song;

import java.util.HashSet;
import java.util.Set;

public class Singer {

    private String name; // 가수 이름

    private Set<String> songs; // 노래 목록

    public Singer(String name) {
        this.name = name;
        this.songs = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getSongs() {
        return songs;
    }

    public void setSongs(Set<String> songs) {
        this.songs = songs;
    }

    /**
     * 노래를 추가하는 메서드
     * @param newSong : 새로 추가할 노래
     */
    public boolean addSong(String newSong) {
        return songs.add(newSong);
    }
}

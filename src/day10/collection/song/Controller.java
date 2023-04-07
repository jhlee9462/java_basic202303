package day10.collection.song;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static day07.util.Utility.makeLine;

public class Controller {

    // key: 가수의 이름, value: 가수 객체
    private static Map<String, Singer> singers;

    static {
        singers = new HashMap<>();
    }

    /**
     * 등록된 가수의 수를 리턴하는 메서드
     *
     * @return : 가수의 수
     */
    public static int numSingers() {
        return singers.size();
    }

    /**
     * 가수를 추가하는 메서드
     *
     * @param newSinger : 새로 추가하는 가수
     * @param songName : 추가하는 노래 이름
     */
    private static void addNewSinger(Singer newSinger, String songName) {
        newSinger.addSong(songName);
        singers.put(newSinger.getName(), newSinger);
    }

    /**
     * 이미 등록된 가수에 새 노래를 추가하는 메서드
     *
     * @param singer  : 가수
     * @param newSong : 새로 추가할 노래
     */
    private static void addNewSong(Singer singer, String newSong) {

        if (!singer.addSong(newSong)) {
            System.out.println("이미 있는 노래입니다.");
            return;
        }

        System.out.println("# " + singer.getName() + "님의 노래목록에 '" + newSong + "'곡이 추가되었습니다.");
    }

    /**
     * Viewer 에서 호출하는 메서드
     */
    public static void registerSong(String singerName, String songName) {
        Singer foundSinger = searchSingerByName(singerName);

        if (foundSinger != null) {
            addNewSong(foundSinger, songName);
            return;
        }

        Singer newSinger = new Singer(singerName);
        addNewSinger(newSinger, songName);
        System.out.println("# 아티스트 " + singerName + "님이 신규 등록되었습니다.");
    }

    /**
     * 이름으로 가수 목록에서 가수를 찾는 메서드
     *
     * @param singerName : 찾을 가수의 이름
     * @return : 찾을 가수, 없으면 null 을 리턴
     */
    private static Singer searchSingerByName(String singerName) {
        return singers.get(singerName);
    }

    /**
     * 노래 목록을 보여주는 메서드
     *
     * @param singerName : 가수의 이름
     */
    public static void showSongList(String singerName) {
        Singer foundSinger = searchSingerByName(singerName);

        if (foundSinger == null) {
            System.out.println("# 해당 가수는 등록되지 않았습니다.");
            return;
        }

        System.out.println("# " + singerName + "님의 노래목록");
        makeLine();

        Set<String> songList = foundSinger.getSongs();
        int songCount = 1;
        for (String song : songList) {
            System.out.println(songCount++ + "번째 노래 : " + song);
        }
    }
}

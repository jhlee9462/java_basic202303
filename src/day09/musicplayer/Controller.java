package day09.musicplayer;

import static day07.util.Utility.makeLine;

public class Controller {

    private static Singer[] singers;

    static {
        singers = new Singer[0];
    }

    /**
     * 등록된 가수의 수를 리턴하는 메서드
     *
     * @return : 가수의 수
     */
    public static int numSingers() {
        return singers.length;
    }

    /**
     * 가수를 추가하는 메서드
     *
     * @param newSinger : 새로 추가하는 가수
     * @param songName : 추가하는 노래 이름
     */
    private static void addNewSinger(Singer newSinger, String songName) {
        Singer[] temp = new Singer[singers.length + 1];

        System.arraycopy(singers, 0, temp, 0, singers.length);

        newSinger.addSong(songName);

        temp[singers.length] = newSinger;
        singers = temp;
    }

    /**
     * 이미 등록된 가수에 새 노래를 추가하는 메서드
     *
     * @param singer  : 가수
     * @param newSong : 새로 추가할 노래
     */
    private static void addNewSong(Singer singer, String newSong) {
        String[] songList = singer.getSongs();

        for (String song : songList) {
            if (song.equals(newSong)) {
                System.out.println("# [" + newSong + "]은(는) 이미 등록된 노래입니다");
                return;
            }
        }

        singer.addSong(newSong);
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
        for (Singer singer : singers) {
            if (singer.getName().equals(singerName))
                return singer;
        }

        return null;
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

        String[] songList = foundSinger.getSongs();
        for (int i = 0; i < songList.length; i++) {
            System.out.println("* " + (i + 1) + ". " + songList[i]);
        }
    }
}

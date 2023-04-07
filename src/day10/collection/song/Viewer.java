package day10.collection.song;

import static day07.util.Utility.input;
import static day07.util.Utility.makeLine;
import static day09.musicplayer.Controller.numSingers;
import static day09.musicplayer.Controller.showSongList;

public class Viewer {

    public static void mainMenu() {
        while (true) {
            System.out.println("*** 음악 관리 프로그램 ***");
            System.out.printf("# 현재 등록된 가수 : %d명\n", numSingers());
            System.out.println("# 1. 노래 등록하기");
            System.out.println("# 2. 노래 정보 검색");
            System.out.println("# 3. 프로그램 종료");
            makeLine();

            switch (input(">>")) {
                case "1":
                    registerSong();
                    break;
                case "2":
                    searchSinger();
                    break;
                case "3":
                    System.exit(0);
            }
        }
    }

    /**
     * 가수를 찾고 노래 리스트를 보여주는 메서드
     */
    private static void searchSinger() {
        System.out.println("# 검색할 가수명을 입력하세요.");
        showSongList(input("- 가수명 : "));
    }

    /**
     * 노래를 등록하는 메서드
     */
    private static void registerSong() {
        System.out.println("# 노래 등록을 시작합니다.");
        String singerName = input("- 가수명 : ");
        String songName = input("- 곡명 : ");

        Controller.registerSong(singerName, songName);
    }
}

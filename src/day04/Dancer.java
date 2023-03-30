package day04;

// 댄서의 설계도
// 설계도에는 main을 만들지 않습니다.

public class Dancer {

    // 속성 (필드)
    String dancerName; // 댄서 이름
    String crewName; // 크루 이름
    String genre; // 춤 장르
    DanceLevel level; // 춤 수준 (0: 초보자, 1: 중수, 2: 고수)

    // 생성자: 스카우터, 개발자(공돌이)


    public Dancer() {
    }

    public Dancer(String dancerName, String crewName, String genre) {
        this.dancerName = dancerName;
        this.crewName = crewName;
        this.genre = genre;
    }

    public Dancer(String dancerName, String crewName, String genre, DanceLevel level) {
        this.dancerName = dancerName;
        this.crewName = crewName;
        this.genre = genre;
        this.level = level;
    }

    // 기능
    // 춤추는 기능
    void dance() {
        System.out.printf("%s 춤을 열정적으로 춥니다.\n", this.genre);
    }

    // 스트레칭을 하는 기능
    void stretch() {
        System.out.println("몸을 유연하게 풉니다.");
    }

    public String getDancerName() {
        return dancerName;
    }

    public void setDancerName(String dancerName) {
        this.dancerName = dancerName;
    }

    public String getCrewName() {
        return crewName;
    }

    public void setCrewName(String crewName) {
        this.crewName = crewName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    // 자기소개 기능
    String introduce() {
        return String.format("내 이름은 %s 이고, %s 팀에 소속되어 있습니다.", dancerName, crewName);
    }
}

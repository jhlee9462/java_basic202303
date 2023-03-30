package day04;

public class DancerMain {

    public static void main(String[] args) {

        Dancer kim = new Dancer();
        kim.dancerName = "김관종";
        kim.crewName = "서커스크루";
        kim.genre = "아이돌댄스";

        Dancer park = new Dancer("갑돌이", "서커스크루", "브레이킹댄스");
        Dancer lee = new Dancer("이효리", "제주도민", "아이돌댄스", DanceLevel.PRO);

        kim.dance();
        park.dance();

        System.out.println(kim.introduce());
        System.out.println(park.introduce());

        Singer song = new Singer("송송파");
    }
}

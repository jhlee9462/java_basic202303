package day09.final_;

public class Main {

    public static void main(String[] args) {

        Person kim = new Person("김철수", "000111-1243242", "대한민국", new BackPack(5, "샘소나이트"));

        kim.name = "김출수";
//        kim.ssn = "0192034-2389403"; // 불가능

//        kim.backPack = new BackPack(10, "기본"); // 불가능

    }
}

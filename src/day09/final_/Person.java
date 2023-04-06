package day09.final_;

class SmartBackPack extends BackPack {
    public SmartBackPack(int size, String brand) {
        super(size, brand);
    }

    @Override
    void getItem() {
        super.getItem();
    }

//    void putItem() {
//
//    } // 불가능
}

class BackPack {
    // 속성
    int size; // 가방 크기 ( 1 ~ 10 )
    String brand; // 브랜드

    public BackPack(int size, String brand) {
        this.size = size;
        this.brand = brand;
    }

    // 기능
    final void putItem() {
        System.out.println("가방에 물건을 넣습니다.");
    }

    void getItem() {

    }
}

public class Person {
    String name; // 이름
    final String ssn; // 주민번호
    String country; // 국적
    final BackPack backPack; // 가방

    public Person(String name, String ssn, String country, BackPack backPack) {
        this.name = name;
        this.ssn = ssn;
        this.country = country;
        this.backPack = backPack;
    }
}

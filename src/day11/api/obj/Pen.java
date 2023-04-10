package day11.api.obj;

import java.util.Objects;

public class Pen {

    Company company; // 제조 회사

    long serial; // 시리얼 번호
    String color; // 색상
    int price; // 가격

    public Pen(Company company,long serial, String color, int price) {
        this.company = company;
        this.serial = serial;
        this.color = color;
        this.price = price;
    }

    // 객체의 필드데이터를 빠르게 확인해볼때
    @Override
    public String toString() {
        return "Pen{" +
                "company=" + company +
                ", serial=" + serial +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    // 시리얼 번호가 같으면 같은 객체로 보고 싶다.
    // equals 를 오버라이딩하면 반드시 hashCode 도 같이 오버라이딩 해야한다.
    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Pen) {
            Pen target = (Pen) obj;
            return this.serial == target.serial
                    && this.color.equals(target.color);
        }

        return false;

    }

    @Override
    public int hashCode() {
        return Objects.hash(serial, color);
    }
}

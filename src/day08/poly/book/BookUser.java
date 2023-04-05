package day08.poly.book;

import day05.member.Gender;

import java.util.Objects;

public class BookUser {

    private String name; // 도서관 회원 이름
    private int age; // 도서관 회원 나이
    private Gender gender; // 도서관 회원 성별
    private int couponCount; // 쿠폰 갯수

    public BookUser() {
    }

    public BookUser(String name, int age, Gender gender, int couponCount) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.couponCount = couponCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getCouponCount() {
        return couponCount;
    }

    public void setCouponCount(int couponCount) {
        this.couponCount = couponCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookUser bookUser = (BookUser) o;
        return age == bookUser.age && Objects.equals(name, bookUser.name) && gender == bookUser.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "[name='" + this.name + "', age=" + this.age +
                ", gender = " + (this.gender == Gender.MALE ? 'm' : 'f') + ", couponCount=" + this.couponCount + "]";
    }
}

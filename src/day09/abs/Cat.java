package day09.abs;

public class Cat extends Pet {

    public Cat(String name, String kind, int age) {
        super(name, kind, age);
    }

    public void eat() {
        System.out.println("고양이가 사료를 먹어요~");
    }
    public void takeNap() {
        System.out.println("고양이가 텐트에서 낮잠을 자요");
    }
}

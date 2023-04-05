package day08.poly.book;

public class ComicBook extends Book {

    private int accessAge; // 나이 제한

    public ComicBook() {}

    public ComicBook(String title, String author, String publisher, int accessAge) {
        super(title, author, publisher);
        this.accessAge = accessAge;
    }

    public int getAccessAge() {
        return accessAge;
    }

    public void setAccessAge(int accessAge) {
        this.accessAge = accessAge;
    }
}

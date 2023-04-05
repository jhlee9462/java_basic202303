package day08.poly.book;

public class BookController {

    private static Book[] bookList;
    private static BookUser[] bookUsers;

    // static 필드의 초기화는 static initializer 를 사용
    // 프로그램 시작시 실행된다.
    static {
        bookList = new Book[0];
        bookUsers = new BookUser[0];
    }

    /**
     * 책 리스트에 책을 저장하는 메서드
     * <p>
     * 이미 있는 책이면 ( equals 사용 ) 저장이 불가능하다
     *
     * @param newBook : 새로 추가할 책
     */
    public static void storeBook(Book newBook) {
        for (Book book : bookList) {
            if (book.equals(newBook))
                return;
        }

        Book[] temp = new Book[bookList.length + 1];
        for (int i = 0; i < bookList.length; i++) {
            temp[i] = bookList[i];
        }
        temp[bookList.length] = newBook;
        bookList = temp;

    }

    /**
     * 북 리스트 줄력
     */
    public static void showBookList() {
        for (int i = 0; i < bookList.length; i++) {
            System.out.print(i + 1 + "번째 도서 : ");
            Book book = bookList[i];
            showBook(book);
        }
    }

    /**
     * 책을 찾는 함수
     * @param word : 검색어
     */
    public static void searchBook(String word) {
        for (Book book : bookList) {
            if (book.getTitle().contains(word) || book.getPublisher().contains(word) || book.getAuthor().contains(word))
                showBook(book);
        }
    }

    /**
     * 책을 빌리는 메서드
     * @param n : 책 번호
     * @param user : 대출할 유저
     */
    public static void borrowBook(int n, BookUser user) {

        if (bookList.length - 1 < --n || n < 0) {
            System.out.println("# 올바른 번호를 입력해주세요");
            return;
        }

        if (bookList[n] instanceof ComicBook && user.getAge() < ((ComicBook) bookList[n]).getAccessAge()) {
            System.out.println(((ComicBook) bookList[n]).getAccessAge() + "미만의 나이는 대출할 수 없는 책입니다.");
            return;
        }

        Book borrowTarget = bookList[n];

        Book[] temp = new Book[bookList.length - 1];
        for (int i = 0; i < n; i++) {
            temp[i] = bookList[i];
        }
        for (int i = n + 1; i < bookList.length; i++) {
            temp[i - 1] = bookList[i];
        }
        bookList = temp;

        System.out.print("# 성공적으로 대여되었습니다.");
        if (borrowTarget instanceof CookBook && ((CookBook) borrowTarget).isCoupon()) {
            increaseCoupon(user);
            System.out.println("요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요");
        }
    }

    /**
     * 책 하나를 출력하는 함수
     * @param book : 출력할 책
     */
    private static void showBook(Book book) {
        System.out.print(book.getClass().getSimpleName() +
                " [ Book [ title='" + (book.getTitle().length() > 8 ? book.getTitle().substring(0, 8) + "..." : book.getTitle()) +
                "', author='" + book.getAuthor() +
                "', publisher='" + book.getPublisher()
                + "']");
        if (book instanceof CookBook)
            System.out.println("coupon=" + ((CookBook) book).isCoupon());
        else
            System.out.println("accessAge=" + ((ComicBook) book).getAccessAge());
    }

    /**
     * 새로운 유저를 추가하는 메서드
     * <p>
     * 이미 있는 유저면 ( equals 재정의 사용 ) 추가가 불가능하다
     *
     * @param newUser : 새로 추가할 유저
     */
    public static void addUser(BookUser newUser) {
        for (BookUser user : bookUsers) {
            if (user.equals(newUser))
                return;
        }

        BookUser[] temp = new BookUser[bookUsers.length + 1];
        for (int i = 0; i < bookUsers.length; i++) {
            temp[i] = bookUsers[i];
        }
        temp[bookUsers.length] = newUser;
        bookUsers = temp;

    }

    /**
     * 로그인 하는 기능
     * @param user : 로그인 하려는 사용자의 정보
     * @return : 로그인 성공시 user 객체, 실패시 null
     */
    public static BookUser login(BookUser user) {
        for (BookUser bookUser : bookUsers) {
            if (user.equals(bookUser))
                return bookUser;
        }
        return null;
    }

    /**
     * 쿠폰을 증가시키는 함수
     * @param user : 쿠폰 갯수를 증가시킬 사용자
     */
    public static void increaseCoupon(BookUser user) {
        user.setCouponCount(user.getCouponCount() + 1);
    }
}

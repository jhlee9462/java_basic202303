package day08.poly.book;

import day05.member.Gender;
import day07.protec.pac1.B;

import static day07.util.Utility.input;
import static day08.poly.book.BookController.*;

public class BookView {

    public static void mainMenu() {
        storeBook(new CookBook("백종원의 집밥", "백종원", "tvN", true));
        storeBook(new ComicBook("한번 더 해요", "미티", "원모어", 19));
        storeBook(new ComicBook("루피의 원피스", "루피", "japan", 12));
        storeBook(new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false));
        storeBook(new CookBook("최현석 날 따라해봐", "최현석", "소금책", true));

        addUser(new BookUser("박영희", 13, Gender.FEMALE, 2));

        showUserMenu();
    }

    public static void showBookMenu(BookUser user) {
        while (true) {
            System.out.println("========== 도서 메뉴 =============");
            System.out.println("# 1. 마이페이지");
            System.out.println("# 2. 도서 전체 조회");
            System.out.println("# 3. 도서 검색");
            System.out.println("# 4. 도서 대여하기");
            System.out.println("# 9. 프로그램 종료하기");
            int inputNumber = Integer.parseInt(input("- 메뉴 번호 : "));

            switch (inputNumber) {
                case 1:
                    System.out.println(user);
                    break;
                case 2:
                    showBookList();
                    break;
                case 3:
                    searchBook(input("# 검색어 : "));
                    break;
                case 4:
                    showBookList();
                    borrowBook(Integer.parseInt(input("# 대여할 도서 번호 입력 : ")), user);
                    break;
                case 9:
                    System.exit(0);
                default:
                    System.out.println("올바른 번호를 입력해 주세요");
            }
        }
    }

    public static void showUserMenu() {
        while (true) {
            switch (Integer.parseInt(input("로그인 하시려면 1번, 회원가입 하시려면 2번을 입력해주세요 : "))) {
                case 1:
                    showBookMenu(showLoginPage());
                    break;
                case 2:
                    showSignUpMenu();
                    break;
                default:
                    System.out.println("올바른 번호를 입력해 주세요. 프로그램이 종료됩니다.");
                    System.exit(0);
            }
        }
    }

    /**
     * 회원가입 메뉴
     */
    public static void showSignUpMenu() {
        System.out.println("# 회원 정보를 입력해 주세요.");
        String inputName = input("이름 : ");
        int inputAge = Integer.parseInt(input("나이 : "));
        Gender inputGender = getGender();

        addUser(new BookUser(inputName, inputAge, inputGender, 0));
    }

    /**
     * 로그인 페이지
     */
    public static BookUser showLoginPage() {
        while (true) {
            System.out.println("# 회원 정보를 입력해 주세요.");
            String inputName = input("이름 : ");
            int inputAge = Integer.parseInt(input("나이 : "));
            Gender inputGender = getGender();

            BookUser currentUser = login(new BookUser(inputName, inputAge, inputGender, 0));

            if (currentUser != null) {
                return currentUser;
            }

            System.out.println("올바르지 않는 정보입니다.");
        }

    }

    /**
     * 성별을 입력받는 함수
     * @return : 성별
     */
    private static Gender getGender() {
        while (true) {
            switch (input("성별(M/F) : ").toUpperCase().charAt(0)) {
                case 'M':
                    return Gender.MALE;
                case 'F':
                    return Gender.FEMALE;
                default:
                    System.out.println("존재하지 않는 성별입니다.");
            }
        }
    }

}

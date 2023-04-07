package day10.exception_;

public class UserMain {

    public static void main(String[] args) {

        LoginUser user = new LoginUser("abc123", "1234");

        user.loginValidate("abc124", "1111");
        user.loginValidate("abc123", "1111");
        System.out.println(user.loginValidate("abc123", "1234"));

    }
}

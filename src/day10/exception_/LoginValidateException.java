package day10.exception_;

public class LoginValidateException extends RuntimeException {

    // 기본 생성자
    public LoginValidateException() {
    }

    // 에러메세지를 받는 생성자
    public LoginValidateException(String message) {
        super(message);
    }
}
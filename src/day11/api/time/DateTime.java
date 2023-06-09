package day11.api.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class DateTime {

    public static void main(String[] args) {

//        Date date = new Date();
//        Calendar calendar = Calendar.getInstance();

        // 현재 날짜 정보 얻기 (년, 월, 일)
        LocalDate nowDate = LocalDate.now();
        System.out.println("nowDate = " + nowDate);

        // 시, 분, 초
        LocalTime nowTime = LocalTime.now();
        System.out.println("nowTime = " + nowTime);

        // 년월일시분추
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println("nowDateTime = " + nowDateTime);

        // 원하는 날짜정보만 얻기
        System.out.println(nowDateTime.getYear());

        // 특정 날짜 만들기
        LocalDateTime targetDate = LocalDateTime.of(2023, 5, 5, 9, 0, 0);
        System.out.println("targetDate = " + targetDate);

        // 날짜 연산
        // 도서 대여 시스템 빌린 날짜로부터 3일 후가 반납일
        LocalDateTime returnDate = nowDateTime.plusDays(3);
        System.out.println("returnDate = " + returnDate);

        LocalDateTime targetDateTime = returnDate
                .plusYears(1)
                .plusMonths(2)
                .plusDays(10)
                .plusHours(5);
        System.out.println("targetDateTime = " + targetDateTime);

        // 사이 날짜 구하기
        LocalDate b = LocalDate.of(2019, 12, 28);
        LocalDate d = LocalDate.of(2023, 3, 10);

        long between = ChronoUnit.DAYS.between(b, d);
        System.out.println("between = " + between);

        // 날짜 포맷 바꾸기
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 a hh시 mm분");

        String formattedDate = nowDateTime.format(pattern);
        System.out.println("formattedDate = " + formattedDate);
    }
}

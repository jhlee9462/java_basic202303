package day05.member;

import java.util.Scanner;

// 역할: 회원관리 앱의 입출력을 담당
public class MemberView {

    Scanner sc;
    MemberRepository mr;

    public MemberView() {
        this.sc = new Scanner(System.in);
        this.mr = new MemberRepository();
    }

    /**
     * 초기 메인 화면을 출력
     */
    void mainView() {
        System.out.println("\n##### 회원 관리 시스템 #####");
        System.out.println("* 1. 회원 정보 등록하기");
        System.out.println("* 2. 개별회원 정보 조회하기");
        System.out.println("* 3. 전체회원 정보 조희하기");
        System.out.println("* 4. 회원 정보 수정하기");
        if (!mr.isEmpty())
            System.out.println("* 5. 회원 정보 삭제하기");
        System.out.println("* 6. 프로그램 끝내기");
        System.out.println("==============================");

    }

    /**
     * 프로그램 화면 흐름을 제어하는 기능
     */
    void viewProcess() {

        while (true) {
            mainView();
            String menuNum = input(">> ");

            switch (menuNum) {
                case "1":
                    signUp();
                    stop();
                    break;
                case "2":
                    showDetailMember();
                    stop();
                    break;
                case "3":
                    mr.showMembers();
                    stop();
                    break;
                case "4":
                    modifyMember();
                    stop();
                    break;
                case "5":
                    if (mr.isEmpty()) return;
                    deleteMember();
                    break;
                case "6":
                    String answer = input("# 정말로 종료합니까? [y/n]");
                    if (answer.toLowerCase().charAt(0) == 'y')
                        System.exit(0);
                    continue;
                default:
                    System.out.println("메뉴 번호를 다시 입력하세요");
                    stop();
                    continue;
            }
        }

    }

    /**
     * 자바스크립트의 프롬프트 느낌의 메서드
     * @param message : 인풋 시에 출력할 메세지 전달
     * @return : 인풋받은 값을 리턴
     */
    String input(String message) {
        System.out.print(message);
        return sc.nextLine();
    }

    // 엔터를 누르기전까지 멈추는 기능
    void stop() {
        System.out.println("\n======= 엔터를 눌러서 계속...=========");
        sc.nextLine();
    }

    // 회원 등록 입력 처리
    void signUp() {
        System.out.println("\n# 회원 등록을 시작합니다!!");
        String email;
        while (true) {
            email = input("# 이메일 : ");
            if (!mr.isDuplicateEmail(email))
                break;
            System.out.println("# 중복된 이메일입니다");
        }

        String name = input("# 이름: ");
        String password = input("# 패스워드 : ");

        Gender gender;
        checkGender: while (true) {
            String inputGender = input("# 성별[M/F] : ");

            switch (inputGender.toUpperCase().charAt(0)) {
                case 'M':
                    gender = Gender.MALE;
                    break checkGender;
                case 'F':
                    gender = Gender.FEMALE;
                    break checkGender;
                default:
                    System.out.println("M 또는 F로 정확히 입력하세요");
            }
        }

        int age = Integer.parseInt(input("# 나이: "));

        // 실제 저장 명령
        mr.addMember(new Member(email,
                password,
                name,
                mr.getLastMemberId() + 1,
                gender,
                age));
    }

    // 회원 개별조회를 위한 입출력처리
    void showDetailMember() {
        // 이메일 입력하세요!
        Member foundMember = getMember();
        if (foundMember == null) return;

        System.out.println(foundMember.info());
    }

    Member getMember() {
        String inputEmail = input("이메일을 입력하세요!");

        // 찾은 회원의 정보 ~~~~~~~~~
        Member foundMember = mr.findMemberByEmail(inputEmail);

        if (foundMember == null) {
            System.out.println("해당하는 이메일을 가진 회원이 없습니다.");
            return null;
        }
        return foundMember;
    }

    void modifyMember() {
        Member foundMember = getMember();
        if (foundMember == null) return;

        String inputEmail = input("# 수정할 이메일 주소를 입력하세요");
        String inputPassword = input("# 수정할 비밀번호를 입력하세요");
        String inputMemberName = input("# 수정할 이름을 입력하세요");
        Gender gender;
        checkGender: while (true) {
            String inputGender = input("# 수정할 성별[M/F] : ");

            switch (inputGender.toUpperCase().charAt(0)) {
                case 'M':
                    gender = Gender.MALE;
                    break checkGender;
                case 'F':
                    gender = Gender.FEMALE;
                    break checkGender;
                default:
                    System.out.println("M 또는 F로 정확히 입력하세요");
            }
        }

        int age = Integer.parseInt(input("# 수정할 나이를 입력하세요"));

        mr.modifyMember(new Member(inputEmail,
                inputPassword,
                inputMemberName,
                mr.getLastMemberId() + 1,
                gender,
                age));
    }

    void deleteMember() {
        Member foundMember = getMember();
        if (foundMember == null) return;

        foundMember = null;
    }
}

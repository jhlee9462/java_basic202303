package day05.member;

// 역할: 회원 저장소 역할
public class MemberRepository {

    Member[] memberList;

    public MemberRepository() {
        this.memberList = new Member[3];
        memberList[0] = new Member("abd@def.com", "1234", "콩벌레", 1, Gender.MALE, 50);
        memberList[1] = new Member("ghi@jkl.com", "9999", "팥죽이", 2, Gender.FEMALE, 40);
        memberList[2] = new Member("jin@ho.com", "9406", "이진호", 3, Gender.MALE, 30);
    }

    /**
     * 모든 회원 정보를 출력해주는 메서드
     */
    void showMembers() {
        System.out.printf("============ 현재 회원정보 (총 %d명) ===============\n", memberList.length);

        for (Member member : memberList) {
            System.out.println(member.info());
        }
    }

    /**
     * 회원 가입 기능
     * @param1 - newMember : 새롭게 회원가입하는 회원의 정보
     * @return : 회원가입 성공 여부
     *           성공시 true, 이메일이 중복되어 실패시 false
     */
    void addMember(Member newMember) {

        if (isDuplicateEmail(newMember.email)) return;

        // 실제로 멤버를 추가하는 코드
        Member[] temp = new Member[memberList.length + 1];
        for (int i = 0; i < memberList.length; i++) {
            temp[i] = memberList[i];
        }

        temp[memberList.length] = newMember;

        memberList = temp;

        return;
    }

    boolean isDuplicateEmail(String email) {
        // 이메일이 중복인가?
        for (Member member : memberList) {
            if (member.email.equals(email)) return true;
        }
        return false;
    }

    // 마지막 회원의 번호를 알려주는 기능
    int getLastMemberId() {
        return memberList[memberList.length - 1].memberId;
    }

    /**
     * 이메일로 멤버를 찾는 기능
     * @param inputEmail : 입력받은 이메일
     * @return : 찾으면 해당 객체를 리턴하고 못찾으면 null을 리턴
     */
    Member findMemberByEmail(String inputEmail) {
        for (Member member : memberList) {
            if (member.email.equals(inputEmail)) {
                return member;
            }
        }

        return null;
    }

    void modifyMember(Member newMember) {
        int targetIndex = -1;

        for (int i = 0; i < memberList.length; i++) {
            Member member = memberList[i];
            if (member.memberId == newMember.memberId) {
                targetIndex = i;
            }
        }

        this.memberList[targetIndex] = newMember;

    }

    void deleteMember(Member targetMember) {
        int targetIndex = -1;

        for (int i = 0; i < memberList.length; i++) {
            Member member = memberList[i];
            if (member.memberId == targetMember.memberId) {
                targetIndex = i;
            }
        }

        Member[] temp = new Member[memberList.length - 1];

        for (int i = 0; i < targetIndex; i++) {
            temp[i] = memberList[i];
        }

        for (int i = targetIndex + 1; i < memberList.length; i++) {
            temp[i - 1] = memberList[i];
        }

        memberList = temp;
    }
}

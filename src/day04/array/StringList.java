package day04.array;

import java.util.Arrays;

// 스트링배열을 제어하는 설계도
public class StringList {

    // 필드
    private String[] sArr;

    // 생성자
    public StringList() {
        this.sArr = new String[0];
    }

    public StringList(String... initData) {
        this.sArr = initData;
    }

    // 메서드
    // 배열에 저장된 데이터 수를 알려주는 기능
    public int size() {
        return sArr.length;
    }

    // 배열의 맨 끝에 데이터를 추가하는 메서드
    public void push(String newData) {
        String[] temp = new String[sArr.length + 1];

        for (int i = 0; i < sArr.length; i++) {
            temp[i] = sArr[i];
        }

        temp[sArr.length] = newData;

        sArr = temp;
        // temp 는 지역변수이기 때문에 메서드 호출이 끝나면 알아서 삭제된다.
    }

    // 배열 맨 끝 데이터 가져오고 삭제하는 기능
    public String pop() {
        String[] temp = new String[sArr.length - 1];

        String delTarget = sArr[sArr.length - 1];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = sArr[i];
        }

        sArr = temp;
        return  delTarget;
    }

    // 배열 내부데이터 출력
    public String toString() {
        return Arrays.toString(sArr);
    }

    // 배열이 텅텅비었는지 확인
    public boolean isEmpty() {
        return sArr.length == 0;
    }

    // 배열 데이터 전체삭제
    void clear() {
        sArr = new String[0];
    }

    // 인덱스 탐색

    // 자료 유무 확인

    // 중간 삭제

    // 중간 삽입

}

package day11.api.io.stream;

import day11.api.io.file.FileExample;

import java.io.*;

public class FileOutputExample {

    public static void main(String[] args) {

        String msg = "멍멍이는~~~ 왈왈~\n하하호호";

        // 데이터를 외부로 내보낼 때 출력스트림
        try (OutputStream fos = new FileOutputStream(new File(FileExample.ROOT_PATH + "/dog.txt"))) {

            fos.write(msg.getBytes());
            System.out.println("파일 저장에 성공");

        } catch (FileNotFoundException e) {
            System.out.println("파일 저장 처리에 실패했습니다.");
        } catch (IOException e) {
            System.out.println("출력 시스템에 문제가 발생했습니다.");
        }

//        finally {
//            if (fos != null) {
//                try {
//                    fos.close();
//                } catch (IOException e) {
//                    System.out.println("출력 스트림 닫기 실패!");
//                }
//            }
//        }

    }
}

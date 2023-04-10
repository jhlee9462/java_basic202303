package day11.api.io.rw;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    public static void main(String[] args) {

        try (FileWriter fw = new FileWriter("D:/exercise/메롱.txt")) {

            String s = "메롱메롱메롱\n약오르짘ㅋㅋㅋ";
            fw.write(s);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

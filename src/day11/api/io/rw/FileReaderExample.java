package day11.api.io.rw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static day11.api.io.Path.ROOT_PATH;

public class FileReaderExample {

    public static void main(String[] args) {

        try (FileReader fr = new FileReader(ROOT_PATH + "/메롱.txt")) {

            BufferedReader br = new BufferedReader(fr);

            String s = br.readLine();
            System.out.println(s);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

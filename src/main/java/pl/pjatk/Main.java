package pl.pjatk;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args){
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2,3));

        File file = new File("jakisPlik.txt");

        try {
            List<String> contents = FileUtils.readLines(file, "UTF-8");

            for (String line : contents) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
//https://mvnrepository.com/artifact/commons-io/commons-io/2.6


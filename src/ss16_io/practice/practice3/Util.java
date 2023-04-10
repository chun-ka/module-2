package ss16_io.practice.practice3;

import furama_resort.utils.write_and_read.WriteFile;
import practice1.model.Student;

import java.io.*;
import java.util.List;

public class Util {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("src/ss16_io/practice/practice3/source_file");
        FileWriter fileWriter = new FileWriter("src/ss16_io/practice/practice3/targetfile");

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String line;
        String string = "";
        while ((line = bufferedReader.readLine()) != null)
            string += line;
        bufferedWriter.write(string);

        bufferedReader.close();
        bufferedWriter.close();
    }
}

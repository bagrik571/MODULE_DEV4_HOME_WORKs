package task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PhoneNumbers {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\bagri\\java16\\MODULE_10_HOME_WORK\\src\\task1\\Phone_Numbers.txt");
        fw.write("(093) 485-1421\n");
        fw.write("(1245) gray 1452\n");
        fw.write("(+31 )-4578-125\n");
        fw.write("063-123-1234\n");
        fw.write("093 124 2589\n");
        fw.flush();
        fw.close();

        FileReader fr = new FileReader("C:\\Users\\bagri\\java16\\MODULE_10_HOME_WORK\\src\\task1\\Phone_Numbers.txt");
        BufferedReader bf = new BufferedReader(fr);
        String line;
        while((line = bf.readLine()) !=null){
            if(line.matches("\\([0-9]{3}\\) [0-9]{3}-[0-9]{4}|[0-9]{3}-[0-9]{3}-[0-9]{4}"))
            System.out.println(line);
        }

    }
}

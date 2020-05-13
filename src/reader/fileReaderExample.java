package reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class fileReaderExample {

    public static void main(String[] args) {
        Reader reader = null;
        try {
            reader = new FileReader("myfile.txt");
            int data;
            while ((data = reader.read()) != -1) {
//                UTF-8 (number)
                System.out.println("char --> " + data);
//                data in file (texts)
//                System.out.print((char)data);
            }
        } catch (FileNotFoundException ex) {
            System.err.println(ex);
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}

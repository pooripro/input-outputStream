package outputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class outputStreamExample {

    public static void main(String[] args) throws IOException {
        InputStream input = null;
        OutputStream output = null;
        try {
//          FileOutputStream ไว้แปลง byte stream ไปเป็น file, 
//          Stream (bus) สำหรับเขียน byte ข้อมูลลง file     
            input = new FileInputStream("myfile.txt");
            output = new FileOutputStream("myfile-copy.txt");
            byte[] bytes = new byte[1024];
            int index;
            while ((index = input.read(bytes)) != 1) {
//                
                output.write(bytes, 0, index);
                System.out.println("index : " + index);
            }
        } catch (FileNotFoundException ex) {
            System.err.println(ex);
        } finally {
            if (input != null) {
                input.close();
            }
            if (output != null) {
                output.close();
            }
        }
    }
}

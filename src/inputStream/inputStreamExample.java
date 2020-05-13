package inputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class inputStreamExample {

    public static void main(String[] args) {
        InputStream input = null;
//          FileInputStream แปลง file ไปเป็น byte stream
//          Stream สำหรับอ่าน byte ข้อมูลจาก file
        try (FileInputStream file = new FileInputStream("myfile.txt");
                BufferedInputStream bf = new BufferedInputStream(file);)
            {
                input = new BufferedInputStream(bf);
                byte[] bytes = new byte[1024];
                int index;
                while ((index = file.read(bytes)) != -1) {
                    System.out.println("index = " + index);
                }
                file.close();
            }catch (FileNotFoundException ex) {
            System.err.println(ex);
        }catch (IOException ex) {
            System.err.println(ex);
        }

        }

    }

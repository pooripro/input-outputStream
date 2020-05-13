
package reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;


public class fileInputStreamReader {
    
    public static void main(String[] args) {
        InputStream input;
        Reader reader;
        try{
            input = new FileInputStream("myfile.txt");
            reader = new InputStreamReader(input);
            int data;
//            data เป็นตัวรับค่าตัวเลขตัวหนังสือ (UTF-16)
            while(((data =reader.read()) != -1)){
                System.out.print((char)data);
            }
        }catch(FileNotFoundException ex){
            System.err.println(ex);
        }catch(IOException ex){
            System.err.println(ex);
        }
    }
}

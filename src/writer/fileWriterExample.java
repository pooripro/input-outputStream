package writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class fileWriterExample {

    public static void main(String[] args) throws IOException {
        Writer writer = null;
        try {
            writer = new FileWriter("writerFile.txt");
            writer.append("Hello");

        } catch (IOException ex) {
            System.err.println(ex);
        } finally {
//            don't forgot to close because input can't write on file !
            if (writer != null) {
                writer.close();
            }
        }
    }
}

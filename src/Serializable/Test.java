package Serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test {

//    Serializable
    public static class Customer implements Serializable {

        String firstName = "Puwa";
        String lastName = "Termnuphan";

        @Override
        public String toString() {
            return "Customer{" + "firstName=" + firstName + ", lastName=" + lastName + '}';
        }
    }

    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("serializable.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);) {
            oos.writeObject(new Customer());
            System.out.println(oos);
            oos.close();
//            File ที่ถูกสร้างจะเป็น binary
        } catch (FileNotFoundException ex) {
            System.err.println(ex);
        } catch (IOException ex) {
            System.err.println(ex);
        }

    }
}

package Assignment.Customer.File;

import Assignment.Customer.Customer;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileCustomer {

    public static Scanner sc;
    public static String fName;
    public static String lName;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        fileCustomer a1 = new fileCustomer();  
//        a1.receiveData(writeCus());
            a1.read();
    }

    public static Customer writeCus() {
        System.out.println("Enter Customer first name : ");
        fName = sc.nextLine();
        System.out.println("Enter Customer last name : ");
        lName = sc.nextLine();
        Customer cus = new Customer(fName, lName);
        return cus;
    }
    
    public static void receiveData(Customer cus){
        try (FileWriter fw = new FileWriter("cusdata.txt");
                BufferedWriter bw = new BufferedWriter(fw);) {
                fw.append("First Name : " + cus.getFirstName());
                fw.append("Last Name : " + cus.getLastName());
                fw.close();
        } catch (IOException ex) {
            System.err.println(ex);
        }

    }
    
    public static void read(){
        try{
            FileReader fr = new FileReader("cusdata.txt");
            int read;
            while((read = fr.read()) != -1){
//                casting UTF-16 to character
                System.out.print((char)read);
            }
        }catch(IOException ex){
            System.err.println(ex);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestException;

/**
 *
 * @author pooripro
 */
public class TestNumException {

    public static void enterNumber(int number) {
        System.out.println("-- open enter number --");
        try {
            if (numberfiltering(number)) {
                System.out.println("input : " + number + " activate number.");
            }
        } catch (numException ex) {
            System.err.println(ex);
        } finally {
            System.out.println("-- close enter number --");
        }

    }
    
//  Exception ที่สร้างเองโดย class numException โดยถ้าตรงตามเงื่อนไขจะสร้าง object
    private static boolean numberfiltering(int numberException) throws numException {
        if (numberException == 0) {
            throw new numException("Invalided number");
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println("Program begining");
        int number = 0;
        enterNumber(number);
        System.out.println("Program endding");
    }
}

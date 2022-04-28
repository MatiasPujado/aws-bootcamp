package palindrome;

import java.util.Scanner;

/**
 * 1 - Número entero capicua. Construir un metodo que reciba un entero como
 * parámetro y devuelva boolean indicando si es capicúa o no dicho número.
 */

public class Main {
    public static void main(String[] args) {
    // Declared variables
    Scanner sc = new Scanner(System.in);
    Integer num;
    String numString;
    Boolean status;

    // Asks the user for an integer number
    System.out.println("Input an integer number");
    num = sc.nextInt();

    // If the input is a negative number, we make it positive.
    if (num < 0) {
        num *= (-1);
    }

    // Save it as a String to make it easier to handle
    numString = num.toString();

    // We store the returning value of isPalindrome in status.
    status = isPalindrome(numString);
    // Then we use the Printer method to print it on screen.
    Printer(status);
}

    /**
     * Determines if the number introduced by the user is a palindrome.
     *
     * @param numString
     * @return Boolean status
     */
    public static Boolean isPalindrome(String numString) {

        String aux = "";
        boolean status = false;

        if (numString.length() == 1) {
            status = true;
        } else {
            for (int i = numString.length() - 1; i >= 0; i--) {
                aux += numString.charAt(i);
            }
            if (numString.equals(aux)) {
                status = true;
            }
        }
        return status;
    }


    /**
     * Prints the corresponding message according to the value of the variable
     * status.
     *
     * @param status
     */
    public static void Printer(Boolean status) {
        if (status) {
            System.out.println("It is a Palindrome.");
        } else {
            System.out.println("It is not a Palindrome.");
        }
    }
}
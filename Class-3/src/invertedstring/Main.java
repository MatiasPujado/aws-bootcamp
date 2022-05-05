package invertedstring;

import java.util.Scanner;

/**
 * 7 - Recursión: Método que recibe un String y lo devuelve invertido.
 */

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text, invText;

        System.out.println("Input a text");
        text = sc.nextLine();

        invText = stringInverter(text);


        System.out.println("invText = " + invText);


    }

    /**
     * Method that returns an inverted String.
     * @param text
     * @return String text
     */
    public static String stringInverter(String text) {

        if (text.length() == 0) {
            return text;
        }
        return stringInverter(text.substring(1)) + text.charAt(0);
    }

}

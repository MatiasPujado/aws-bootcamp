package decimal.to.binary;

import java.util.Scanner;

/**
 *  4 - Metodo que recibe un double en formato binario y devuelve un entero en
 *  formato decimal.
 */

public class Main {
    public static void main(String[] args) {
        // Declared variables
        Scanner sc = new Scanner(System.in);
        Integer numInteger, aux;
        Double numBin;
        String numBinary;

        // Asks the user for a binary number
        System.out.println("Input a binary number");
        numBin = sc.nextDouble();

        aux = numBin.intValue();
        numBinary = String.valueOf(aux);

        // Calls the Conversor function and saves the value it returns
//		numInteger = Conversor(numBinary);
        numInteger = Conversor2(numBinary);

        // Then, prints it on screen.
        System.out.println("");
        System.out.println(numInteger);
        System.out.println("");

    }

    /**
     * Converts a binary number into a decimal number
     *
     * @param numBinary
     * @return Integer numDecimal
     */
    public static Integer Conversor(String numBinary) {
        // Declared variables
        Integer numDecimal = 0, numLength;
        String aux = "";

        numLength = numBinary.length();
        numDecimal = 0;

        for (int i = numLength - 1; i >= 0; i--) {
            aux += numBinary.charAt(i);
        }

        for (int i = 0; i < numLength; i++) {
            if (aux.substring(i, i + 1).equals("1")) {
                numDecimal += 2 ^ (i);
            }
        }

        return numDecimal;

    }

    /**
     * Converts a binary number into a decimal number
     *
     * @param numBinary
     * @return Integer numDecimal
     */
    public static Integer Conversor2(String numBinary) {
        Integer numDecimal = 0;

        numDecimal = Integer.parseInt(numBinary,2);

        return numDecimal;
    }

}

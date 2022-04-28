package binary.to.decimal;

import java.util.Scanner;

/**
 *3 - Metodo que recibe un entero en formato decimal y devuelve un double en
 * formato binario.
 */

public class Main {
    public static void main(String[] args) {
        // Declared variables
        Scanner sc = new Scanner(System.in);
        Integer numInteger;
        Double numBinary;

        // Asks the user for a positive integer
        System.out.println("Input a positive integer");
        do {
            numInteger = sc.nextInt();
        } while (numInteger < 0);

        // Calls the Conversor function to calculate its binary
        numBinary = Conversor(numInteger);

        // Then, prints it on screen.
        System.out.println("");
        System.out.println(numBinary);
        System.out.println("");

    }

    /**
     * Calculates the binary equivalent of a decimal number.
     *
     * @param numInteger
     * @return Double value
     */
    public static Double Conversor(Integer numInteger) {

        String aux = "", binary = "";
        int reminder;
        Double numBinary;

        // Converts the number to the binary system
        if (numInteger == 0 || numInteger == 1) {
            binary = numInteger.toString();
        } else {
            while (numInteger > 0) {
                reminder = numInteger % 2;
                if (reminder == 0) {
                    binary += "0";
                } else {
                    binary += "1";
                }
                numInteger = Math.floorDiv(numInteger, 2);
            }

            // Reorders digits
            for (int i = binary.length() - 1; i >= 0; i--) {
                aux += binary.charAt(i);
            }

        }

        // Lastly we add as may "0"s as needed to complete an 8 digit bit.
        // It only works if it returns a String
//		while (aux.length() <= 8) {
//			aux = "0" + aux;
//		}

        numBinary = Double.parseDouble(aux);

        return numBinary;
    }

}

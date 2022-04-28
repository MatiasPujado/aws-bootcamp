package factorial;

import java.util.Scanner;

/**
 * 2 - Factorial. Metodo que recibe un entero y devuelve el factorial del mismo
 */

public class Main {
    public static void main(String[] args) {
        // Declared variables
        Scanner sc = new Scanner(System.in);
        int num;

        // We ask the user to input a positive integer
        System.out.println("Input a positive integer");
        do {
            num = sc.nextInt();
        } while (num < 0);

        // We call Factorial method to calculate its factorial number and show it on
        // screen.
        Factorial(num);
    }

    /**
     * Method that calculates the factorial of a given number and then prints it on
     * screen.
     *
     * @param num
     */
    public static void Factorial(int num) {
        // Declared variables
        int fact = 1;
        String result = "";

        if (num == 0 || num == 1) {
            System.out.println("");
            System.out.println(num + "!: " + fact);
            System.out.println("");
        } else {
            for (Integer i = 1; i <= num; i++) {
                fact *= i;
                if (i < num) {
                    result += i.toString() + " x ";
                } else {
                    result += i.toString();
                }
            }
            System.out.println("");
            System.out.println(num + "!: " + result + " = " + fact);
            System.out.println("");
        }

    }

}

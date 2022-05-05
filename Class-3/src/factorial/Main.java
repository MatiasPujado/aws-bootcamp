package factorial;

import java.util.Scanner;

/**
 * 5 - Recursion: Método factorial recursivo
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input, result;


        System.out.println("Input an integer number");
        input = sc.nextInt();

        result = recursiveFactorial(input);
        System.out.println("");
        System.out.println(input + "!: " + result);
    }

    /**
     * Recursive method to calculate a factorial's number
     *
     * @param input
     * @return int
     */
    public static int recursiveFactorial(int input) {
        // Base case
        if (input == 0 || input == 1) {
            return 1;
        }
        // recursive call
        return input * recursiveFactorial(input - 1);
    }
}

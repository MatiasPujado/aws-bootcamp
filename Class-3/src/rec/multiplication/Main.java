package rec.multiplication;

import java.util.Scanner;

/**
 * 6 - Recursion: Calcular el producto de dos enteros sin utilizar multiplicación
 */

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num, times, result;

        System.out.println("Input the number you want to multiply");
        num = sc.nextInt();
        System.out.println("How many times?");
        times = sc.nextInt();

        result= recursiveSum(num, times);

        System.out.println("result = " + result);


    }

    /**
     * Recursive Sum simulating multiplication behaviour
     * @param num
     * @param times
     * @return int num
     */
    public static int recursiveSum(int num, int times) {
        if (num == 0 || times == 0) {
            return 0;
        }
        if (times == 1) {
            return num;
        }
        return num + recursiveSum(num, times-1);
    }
}

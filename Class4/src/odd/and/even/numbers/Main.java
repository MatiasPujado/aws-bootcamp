package odd.and.even.numbers;

/**
 * Threads:
 *
 * 2) Generar un Thread o una Implementacion de Runnable que imprima numeros pares (1 al 10) y calcule la suma.
 * Lanzar junto a otro Thread o Runnable que imprima impares (1 al 10) y calcula la suma.  Cada Thread muestra la suma resultante cuando finaliza.
 * Utilizar las pausas necesarias para que se observe el paralelismo.
 *
 */

public class Main {
    public static void main(String[] args) {

        OddNumbers oddNum = new OddNumbers();
        EvenNumbers evenNum = new EvenNumbers();

        Thread evenNumbersThread = new Thread(evenNum);
        Thread oddNumbersThread = new Thread(oddNum);
        Thread evenNumbersThread2 = new Thread(evenNum);
        Thread oddNumbersThread2 = new Thread(oddNum);

        evenNumbersThread.start();
//        oddNumbersThread.start();
//        evenNumbersThread2.start();
//        oddNumbersThread2.start();
//
    }
}

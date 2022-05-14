package delayednumbers;

/**
 * Threads:
 * 1) Mostrar los numeros del 1 al 20 con un retardo de 3 segundos entre cada numero
 */

public class Main {
    public static void main(String[] args) {
        DelayedNumbers dn = new DelayedNumbers();
        Thread myThread = new Thread(dn);
        myThread.start();

    }
}

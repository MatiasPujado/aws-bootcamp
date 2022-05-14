package odd.and.even.numbers;

public class OddNumbers implements Runnable {

    private int sumOdd;

    public OddNumbers() {
    }

    public OddNumbers(int sumOdd) {
        this.sumOdd = sumOdd;
    }

    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
                sumOdd += i;
            }

            try {
                Thread.sleep(2000);
            } catch (InterruptedException ignored) {

            }
        }
        System.out.println("sumOdd = " + sumOdd);
    }
}

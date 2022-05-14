package odd.and.even.numbers;

public class EvenNumbers implements Runnable {

    private int sumEven;

    public EvenNumbers() {
    }

    public EvenNumbers(int sumEven) {
        this.sumEven = sumEven;
    }

    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sumEven += i;
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ignored) {

            }
        }
        System.out.println("sumEven = " + sumEven);
    }
}

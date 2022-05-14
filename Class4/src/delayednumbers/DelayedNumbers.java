package delayednumbers;

public class DelayedNumbers implements Runnable {

    public DelayedNumbers() {
    }
    
    @Override
    public void run() {
        for (int i = 1; i < 21; i++) {
            System.out.println(i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

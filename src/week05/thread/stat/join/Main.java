package week05.thread.stat.join;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                Thread.sleep(5000); // 5초
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread = new Thread(task, "thread"); // New

        thread.start(); // New -> Runnable

        long start = System.currentTimeMillis();

        System.out.println("소요시간 = " + (System.currentTimeMillis() - start));
    }
}
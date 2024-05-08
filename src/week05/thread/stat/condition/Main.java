package week05.thread.stat.condition;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static final int MAX_TASK = 5;
    private ReentrantLock lock = new ReentrantLock();

    private Condition condition1 = lock.newCondition();
    private Condition condition2 = lock.newCondition();

    private ArrayList<String> tasks = new ArrayList<>();

    public void addMethod(String task) {
        lock.lock();

        try {
            while(tasks.size() >= MAX_TASK) {
                String name = Thread.currentThread().getName();
                System.out.println(name+" is waiting.");
                try {
                    condition1.await();
                    Thread.sleep(500);
                } catch(InterruptedException e) {}
            }

            tasks.add(task);
            condition2.signal();
            System.out.println("Tasks:" + tasks.toString());
        } finally {
            lock.unlock();
        }
    }
}
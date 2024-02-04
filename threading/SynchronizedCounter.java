package com.oops.threading;

/**
 * Class demonstrating thread synchronization
 */
public class SynchronizedCounter {
    private int count = 0;

    // Synchronized method
    public synchronized void increment() {
        count++;
        System.out.println(Thread.currentThread().getName() + ": Count = " + count);
    }

    // Synchronized block
    public void incrementWithBlock() {
        synchronized (this) {
            count++;
            System.out.println(Thread.currentThread().getName() + ": Count = " + count);
        }
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        SynchronizedCounter counter = new SynchronizedCounter();

        // Create threads that use synchronized method
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                counter.increment();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Thread-1");

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                counter.increment();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Thread-2");

        // Create threads that use synchronized block
        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                counter.incrementWithBlock();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Thread-3");

        Thread thread4 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                counter.incrementWithBlock();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Thread-4");

        // Start all threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        // Wait for all threads to complete
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + counter.getCount());
    }
} 
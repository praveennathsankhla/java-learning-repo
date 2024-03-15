package com.oops.threading;

/**
 * Class demonstrating basic thread creation and execution
 */
public class ThreadDemo extends Thread {
    private String threadName;

    public ThreadDemo(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(threadName + ": Count " + i);
                Thread.sleep(1000); // Sleep for 1 second
            }
        } catch (InterruptedException e) {
            System.out.println(threadName + " interrupted.");
        }
        System.out.println(threadName + " exiting.");
    }

    public static void main(String[] args) {
        // Create two threads
        ThreadDemo thread1 = new ThreadDemo("Thread-1");
        ThreadDemo thread2 = new ThreadDemo("Thread-2");

        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for threads to complete
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main thread exiting.");
    }
} 
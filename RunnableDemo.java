package com.oops.threading;

/**
 * Class demonstrating thread creation using Runnable interface
 */
public class RunnableDemo implements Runnable {
    private String threadName;

    public RunnableDemo(String threadName) {
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
        // Create two Runnable objects
        RunnableDemo runnable1 = new RunnableDemo("Runnable-1");
        RunnableDemo runnable2 = new RunnableDemo("Runnable-2");

        // Create threads from Runnable objects
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

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
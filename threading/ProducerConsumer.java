package com.oops.threading;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Class demonstrating producer-consumer pattern using wait() and notify()
 */
public class ProducerConsumer {
    private Queue<Integer> queue;
    private int maxSize;

    public ProducerConsumer(int maxSize) {
        this.queue = new LinkedList<>();
        this.maxSize = maxSize;
    }

    public synchronized void produce(int value) throws InterruptedException {
        while (queue.size() == maxSize) {
            System.out.println("Queue is full. Producer is waiting...");
            wait();
        }

        queue.add(value);
        System.out.println("Produced: " + value);
        notify();
    }

    public synchronized int consume() throws InterruptedException {
        while (queue.isEmpty()) {
            System.out.println("Queue is empty. Consumer is waiting...");
            wait();
        }

        int value = queue.poll();
        System.out.println("Consumed: " + value);
        notify();
        return value;
    }

    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer(5);

        // Producer thread
        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    pc.produce(i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Consumer thread
        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    pc.consume();
                    Thread.sleep(2000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start threads
        producer.start();
        consumer.start();

        // Wait for threads to complete
        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
} 
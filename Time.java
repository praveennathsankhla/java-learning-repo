package com.oops.classes;

/**
 * Time class with overloaded constructors
 */
public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    // Constructor with all parameters
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    // Constructor with hours and minutes
    public Time(int hours, int minutes) {
        this(hours, minutes, 0);
    }

    // Constructor with only hours
    public Time(int hours) {
        this(hours, 0, 0);
    }

    // Default constructor
    public Time() {
        this(0, 0, 0);
    }

    public void displayTime() {
        System.out.printf("Time: %02d:%02d:%02d%n", hours, minutes, seconds);
    }

    public static void main(String[] args) {
        // Testing all constructors
        Time time1 = new Time(14, 30, 45);
        time1.displayTime();

        Time time2 = new Time(14, 30);
        time2.displayTime();

        Time time3 = new Time(14);
        time3.displayTime();

        Time time4 = new Time();
        time4.displayTime();
    }
} 
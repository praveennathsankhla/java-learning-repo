package com.oops.polymorphism;

/**
 * MusicPlayer class that implements Playable interface
 */
public class MusicPlayer implements Playable {
    private String song;

    public MusicPlayer(String song) {
        this.song = song;
    }

    @Override
    public void play() {
        System.out.println("Playing music: " + song);
    }

    @Override
    public void stop() {
        System.out.println("Stopping music: " + song);
    }
} 
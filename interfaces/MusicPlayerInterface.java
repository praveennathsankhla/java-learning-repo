package com.oops.interfaces;

/**
 * MusicPlayer class implementing PlayableInterface
 */
public class MusicPlayerInterface implements PlayableInterface {
    private String song;

    public MusicPlayerInterface(String song) {
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

    public static void main(String[] args) {
        MusicPlayerInterface player = new MusicPlayerInterface("Shape of You");
        player.play();
        player.stop();
    }
} 
package com.oops.polymorphism;

/**
 * VideoPlayer class that implements Playable interface
 */
public class VideoPlayer implements Playable {
    private String video;

    public VideoPlayer(String video) {
        this.video = video;
    }

    @Override
    public void play() {
        System.out.println("Playing video: " + video);
    }

    @Override
    public void stop() {
        System.out.println("Stopping video: " + video);
    }

    public static void main(String[] args) {
        // Demonstrating interface polymorphism
        Playable musicPlayer = new MusicPlayer("Shape of You");
        Playable videoPlayer = new VideoPlayer("Tutorial Video");

        System.out.println("Music Player:");
        musicPlayer.play();
        musicPlayer.stop();

        System.out.println("\nVideo Player:");
        videoPlayer.play();
        videoPlayer.stop();
    }
} 
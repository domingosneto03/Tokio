package org.example;
public class Player {
    private String name;
    private int discoveredWords;
    private int points;

    public Player(String name, int discoveredWords, int points) {
        this.name = name;
        this.discoveredWords = discoveredWords;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiscoveredWords() {
        return discoveredWords;
    }

    public void setDiscoveredWords(int discoveredWords) {
        this.discoveredWords = discoveredWords;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}

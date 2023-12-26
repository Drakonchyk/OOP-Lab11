package ua.ucu.edu.apps.task3;

public class ProxyImage implements MyImage {
    private final RealImage realImage;

    public ProxyImage(String filename) { realImage = new RealImage(filename); }

    @Override
    public void display() { realImage.display(); }
}
package org.example.patterns.structural.proxy;

public class ProxyTest {
    public static void main(String[] args) {
        String file = "test.jpg";
        Image proxyImage = new ProxyImage(file);
        proxyImage.display();
        proxyImage.display();
    }
}

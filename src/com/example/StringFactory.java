package com.example;

class StringFactory {
    private static StringFactory instance = new StringFactory();

    public static StringFactory getInstance() {
        return instance;
    }

    public HelloWorldString createHelloWorldString(String str) {
        HelloWorldString s = new HelloWorldString();
        s.string = str;
        return s;
    }
}

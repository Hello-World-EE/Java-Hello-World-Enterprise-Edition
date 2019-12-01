package com.example;

public class HelloWorld {
    public HelloWorld() {
        HelloWorldFactory factory = HelloWorldFactory.getInstance();
        IHelloWorld helloWorld = factory.createHelloWorld();
        IHelloWorldString helloWorldString = helloWorld.getHelloWorld();
        IPrintStrategy printStrategy = helloWorld.getPrintStrategy();
        IStatusCode code = helloWorld.print(printStrategy, helloWorldString);
        if (code.getStatusCode() != 0) {
            throw new RuntimeException("Failed to print: " + code.getStatusCode());
        }
    }
}

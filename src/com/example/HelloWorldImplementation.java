package com.example;

class HelloWorldImplementation implements IHelloWorld {
    public IHelloWorldString getHelloWorld() {
        return new HelloWorldStringImplementation();
    }

    public IPrintStrategy getPrintStrategy() {
        PrintStrategyFactory factory = PrintStrategyFactory.getInstance();
        return factory.createIPrintStrategy();
    }

    public IStatusCode print(IPrintStrategy strategy, IHelloWorldString toPrint) {
        return strategy.print(toPrint);
    }
}

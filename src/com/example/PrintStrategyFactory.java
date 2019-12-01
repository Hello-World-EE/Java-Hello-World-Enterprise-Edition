package com.example;

class PrintStrategyFactory {
    private static PrintStrategyFactory instance = new PrintStrategyFactory();

    public static PrintStrategyFactory getInstance() {
        return instance;
    }

    public IPrintStrategy createIPrintStrategy() {
        IPrintStrategy printStrategy = new PrintStrategyImplementation();
        IStatusCode code = printStrategy.setupPrinting();
        if (code.getStatusCode() != 0) {
            throw new RuntimeException("Failed to create IPrintStrategy: " + code.getStatusCode());
        }
        return printStrategy;
    }
}

package com.example;

interface IHelloWorld {
    IHelloWorldString getHelloWorld();

    IPrintStrategy getPrintStrategy();

    IStatusCode print(IPrintStrategy strategy, IHelloWorldString toPrint);
}

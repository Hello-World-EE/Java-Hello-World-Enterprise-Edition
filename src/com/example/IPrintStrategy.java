package com.example;

interface IPrintStrategy {
    IStatusCode setupPrinting();

    IStatusCode print(IHelloWorldString string);
}

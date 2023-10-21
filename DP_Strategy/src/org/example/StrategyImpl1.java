package org.example;

public class StrategyImpl1 implements Strategy {
    @Override
    public void efectuerOperation() {
        System.out.println("******* STRATEGY 1 *********");
    }
}

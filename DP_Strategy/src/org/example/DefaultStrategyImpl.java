package org.example;

public class DefaultStrategyImpl implements Strategy {
    @Override
    public void efectuerOperation() {
        System.out.println("******* DEFAULT STRATEGY *********");
    }
}

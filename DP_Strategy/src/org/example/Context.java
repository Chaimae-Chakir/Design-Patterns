package org.example;

public class Context {
    private Strategy strategy;

    public void effectuerOperation(){
            System.out.println("***************");
            strategy.efectuerOperation();
            System.out.println("===============");
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

}

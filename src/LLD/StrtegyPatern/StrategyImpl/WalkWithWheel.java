package LLD.StrtegyPatern.StrategyImpl;

import LLD.StrtegyPatern.Strategy.Walk;

public class WalkWithWheel implements Walk {
    @Override
    public void walk() {
        System.out.println("WalkWithWheel");
    }
}

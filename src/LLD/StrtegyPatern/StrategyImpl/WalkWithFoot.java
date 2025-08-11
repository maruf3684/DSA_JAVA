package LLD.StrtegyPatern.StrategyImpl;

import LLD.StrtegyPatern.Strategy.Walk;

public class WalkWithFoot implements Walk {
    @Override
    public void walk() {
        System.out.println("WalkWithFoot");
    }
}

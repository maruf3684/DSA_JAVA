package LLD.StrtegyPatern.StrategyImpl;

import LLD.StrtegyPatern.Strategy.Fly;

public class FlyWithWings implements Fly {
    @Override
    public void fly() {
        System.out.println("FlyWithWings");
    }
}

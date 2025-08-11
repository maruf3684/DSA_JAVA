package LLD.StrtegyPatern.StrategyImpl;

import LLD.StrtegyPatern.Strategy.Fly;

public class FlyWithJet implements Fly {
    @Override
    public void fly() {
        System.out.println("FlyWithJet");
    }
}

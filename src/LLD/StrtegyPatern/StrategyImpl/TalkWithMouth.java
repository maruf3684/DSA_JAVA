package LLD.StrtegyPatern.StrategyImpl;

import LLD.StrtegyPatern.Strategy.Talk;

public class TalkWithMouth implements Talk {

    @Override
    public void talk() {
        System.out.println("TalkWithMouth");
    }
}

package LLD.StrtegyPatern;

import LLD.StrtegyPatern.Strategy.Fly;
import LLD.StrtegyPatern.Strategy.Talk;
import LLD.StrtegyPatern.Strategy.Walk;
import LLD.StrtegyPatern.StrategyImpl.*;

public class main {
    public static void main(String[] args) {
        //making for type 1 robot
        Fly flyWithWings = new FlyWithWings();
        Talk talkWithMouth = new TalkWithMouth();
        Walk walkWithFoot = new WalkWithFoot();

        Robot roboType1 = new Robot(flyWithWings,talkWithMouth,walkWithFoot);
        roboType1.fly();
        roboType1.talk();
        roboType1.walk();
        roboType1.projection();


        //making for type 2 robot
        Fly flyWithJet = new FlyWithJet();
        Talk talkWithMouth1 = new TalkWithMouth();
        Walk walkWithWheel = new WalkWithWheel();

        Robot robotType2 = new Robot(flyWithJet,talkWithMouth1,walkWithWheel);
        robotType2.fly();
        robotType2.talk();
        robotType2.walk();
        robotType2.projection();

    }
}

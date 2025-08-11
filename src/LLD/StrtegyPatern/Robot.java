package LLD.StrtegyPatern;

import LLD.StrtegyPatern.Strategy.Fly;
import LLD.StrtegyPatern.Strategy.Talk;
import LLD.StrtegyPatern.Strategy.Walk;

public class Robot {
    private Fly fly;
    private Talk talk;
    private Walk walk;

    public Robot(Fly fly, Talk talk, Walk walk) {
        this.fly = fly;
        this.talk = talk;
        this.walk = walk;
    }



    public void projection(){
        System.out.println("basic Projection");
    }


    //just delegating to corrisponding object

    public void fly(){
        this.fly.fly();
    }

    public void walk(){
        this.walk.walk();
    }

    public void talk(){
        this.talk.talk();
    }
}

package com.labs.sd.day2.polymorphism.inheritance;

public class Example2 {

    public static void main(String[] args)
    {
        Sachin c = new Sachin();
        c.play();
        c.perform();
    }
}



interface Bolling {
    void play();
}
interface Batting {
    void play();
}

interface Player extends Bolling, Batting {
    public void play();
}
class Sachin implements Player {
    @Override public void play()
    {
        System.out.println("Best player");
    }

    public void perform() { System.out.println("for"); }
}


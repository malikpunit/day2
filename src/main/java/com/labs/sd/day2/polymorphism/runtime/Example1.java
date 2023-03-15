package com.labs.sd.day2.polymorphism.runtime;

public class Example1 {

    public static void main(String[] args) {
        /**
         * RUN TIME POLYMORPHISM
         */


        Audi a = new Audi();
        a.speed();
        a.accelerate();

        Maruti m = new Maruti();
        m.speed();
        m.accelerate();

        Car c = new Car();
        c.speed();
        c.accelerate();

      c  = new Audi();

        c.speed();
        c.accelerate();

          c = new Maruti();
        c.speed();
        c.accelerate();
    }

}
class Car{

    void speed(){
        System.out.println("10 km");
    }

    static void accelerate(){
        System.out.println("normal");
    }

}

class Maruti extends Car{


    void speed(){
        System.out.println("100 km");
    }

    static void accelerate(){
        System.out.println("ver slow");
    }
}

class Audi extends Car{


    void speed(){
        System.out.println("500 km");
    }


    static void accelerate(){
        System.out.println("very fast");
    }
}

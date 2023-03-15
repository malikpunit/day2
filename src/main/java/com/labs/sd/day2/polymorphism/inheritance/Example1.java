package com.labs.sd.day2.polymorphism.inheritance;

public class Example1 {
    public static void main(String[] args){
        A a  = new A();
        a.fun();
        a =  new B();
        a.fun();



       /* C c = new C();*/

    }

}
class A{
    void fun(){
        System.out.println("A");
    }

}

class B extends A{
    void fun(){
        System.out.println("B");
    }
}
/*
class C extends A, B {
    void fun(){

    }
}*/

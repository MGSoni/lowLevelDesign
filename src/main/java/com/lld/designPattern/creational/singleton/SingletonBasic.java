package com.lld.designPattern.creational.singleton;

public class SingletonBasic {

    private SingletonBasic(){};


                                                    //First Implementation

   /* public static SingletonBasic createInstance(){
        SingletonBasic sb = new SingletonBasic();
        return sb;
    }*/


                                                    // Second Implementation

    private static final SingletonBasic instance = null;

    public static SingletonBasic createInstance(){
        if(instance==null){
            SingletonBasic sb = new SingletonBasic();
            return sb;
        }
        return instance;
    }

                                                //Early Loading/ Eager Implementation

    /*private static final SingletonBasic instance = new SingletonBasic();

    public static SingletonBasic createInstance(){
        return instance;
    }*/
}

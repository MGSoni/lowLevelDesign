package com.lld.designPattern.creational.singleton;

public class SingletonDoubleLocking {

    private SingletonDoubleLocking(String name){};

    private static final SingletonDoubleLocking instance = null;

    public static SingletonDoubleLocking createInstance(String name){
        if(instance==null){
            synchronized (SingletonDoubleLocking.class){
                if(instance==null){
                    SingletonDoubleLocking instance = new SingletonDoubleLocking(name);
                    return instance;
                }
            }
        }
        return instance;
    }
}

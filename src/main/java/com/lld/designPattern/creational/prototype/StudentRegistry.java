package com.lld.designPattern.creational.prototype;

import java.util.HashMap;

public class StudentRegistry {
    private HashMap<String,Student> map = new HashMap<>();

    void register(String key, Student value){
        map.put(key,value);
    }
    Student getRegistry(String key){
        return map.get(key);
    }
}

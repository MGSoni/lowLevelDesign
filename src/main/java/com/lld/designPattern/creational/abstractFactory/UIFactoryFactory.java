package com.lld.designPattern.creational.abstractFactory;

public class UIFactoryFactory {

    public static UIFactory getUIFactoryForPlatform(SupportedPlatform platform){
        return switch (platform){
            case IOS -> new IOSUIFactory();
            case ANDROID -> new AndroidUIFactory();
        };
    }
}

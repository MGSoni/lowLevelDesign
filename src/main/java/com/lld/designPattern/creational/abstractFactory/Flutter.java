package com.lld.designPattern.creational.abstractFactory;

public class Flutter {

    public void setTheme(){
        System.out.println("Setting Theme");
    }

    public void refreshRate(){
        System.out.println("Setting Refresh Rate");
    }

    public UIFactory createUIFactory(SupportedPlatform platform){
        /*if(platform.equals(SupportedPlatform.ANDROID)){
            return new AndroidUIFactory();
        }
        if(platform.equals(SupportedPlatform.IOS)){
            return new IOSUIFactory();
        }
        return null;*/

        return UIFactoryFactory.getUIFactoryForPlatform(platform);
    }

}

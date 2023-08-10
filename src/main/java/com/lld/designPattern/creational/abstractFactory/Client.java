package com.lld.designPattern.creational.abstractFactory;

import com.lld.designPattern.creational.abstractFactory.components.buttons.Button;
import com.lld.designPattern.creational.abstractFactory.components.menus.Menu;

public class Client {

    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.createUIFactory(SupportedPlatform.ANDROID);
        Button button = uiFactory.createButton();
        button.changeSize();

        Menu menu = uiFactory.createMenu();
    }
}

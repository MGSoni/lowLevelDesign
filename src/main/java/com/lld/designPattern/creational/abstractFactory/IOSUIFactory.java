package com.lld.designPattern.creational.abstractFactory;

import com.lld.designPattern.creational.abstractFactory.components.buttons.Button;
import com.lld.designPattern.creational.abstractFactory.components.buttons.IOSButton;
import com.lld.designPattern.creational.abstractFactory.components.dropdowns.DropDown;
import com.lld.designPattern.creational.abstractFactory.components.dropdowns.IOSDropDown;
import com.lld.designPattern.creational.abstractFactory.components.menus.IOSMenu;
import com.lld.designPattern.creational.abstractFactory.components.menus.Menu;

public class IOSUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new IOSDropDown();
    }
}

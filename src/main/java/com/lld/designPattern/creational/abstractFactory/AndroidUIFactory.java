package com.lld.designPattern.creational.abstractFactory;

import com.lld.designPattern.creational.abstractFactory.components.buttons.AndroidButton;
import com.lld.designPattern.creational.abstractFactory.components.buttons.Button;
import com.lld.designPattern.creational.abstractFactory.components.dropdowns.AndroidDropDown;
import com.lld.designPattern.creational.abstractFactory.components.dropdowns.DropDown;
import com.lld.designPattern.creational.abstractFactory.components.menus.AndroidMenu;
import com.lld.designPattern.creational.abstractFactory.components.menus.Menu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }
}

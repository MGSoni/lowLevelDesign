package com.lld.designPattern.creational.abstractFactory;

import com.lld.designPattern.creational.abstractFactory.components.buttons.Button;
import com.lld.designPattern.creational.abstractFactory.components.dropdowns.DropDown;
import com.lld.designPattern.creational.abstractFactory.components.menus.Menu;

public interface UIFactory {

    public Button createButton();
    public Menu createMenu();
    public DropDown createDropDown();
}

package oops.designpattern.factory;

import oops.designpattern.factory.component.Button.Button;
import oops.designpattern.factory.component.Button.IOSButton;
import oops.designpattern.factory.component.dropdown.DropDown;
import oops.designpattern.factory.component.dropdown.IOSDropDown;
import oops.designpattern.factory.component.menu.IOSMenu;
import oops.designpattern.factory.component.menu.Menu;

public class iOSUIFactory implements UIFactory{
    @Override
    public IOSButton createButton() {
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

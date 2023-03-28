package liveclass.designpattern.factory;

import oops.designpattern.factory.UIFactory;
import oops.designpattern.factory.component.Button.Button;
import oops.designpattern.factory.component.Button.IOSButton;
import oops.designpattern.factory.component.dropdown.DropDown;
import oops.designpattern.factory.component.dropdown.IOSDropDown;
import oops.designpattern.factory.component.menu.IOSMenu;
import oops.designpattern.factory.component.menu.Menu;

public class iOSFactory implements UIFactory {
    @Override
    public IOSButton createButton() {
        return new IOSButton();
    }

    @Override
    public IOSMenu createMenu() {
        return new IOSMenu();
    }

    @Override
    public IOSDropDown createDropDown() {
        return new IOSDropDown();
    }
}

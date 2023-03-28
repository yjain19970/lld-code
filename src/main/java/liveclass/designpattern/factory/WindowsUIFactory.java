package liveclass.designpattern.factory;

import oops.designpattern.factory.UIFactory;
import oops.designpattern.factory.component.Button.Button;
import oops.designpattern.factory.component.dropdown.DropDown;
import oops.designpattern.factory.component.menu.Menu;

public class WindowsUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return null;
    }

    @Override
    public Menu createMenu() {
        return null;
    }

    @Override
    public DropDown createDropDown() {
        return null;
    }
}

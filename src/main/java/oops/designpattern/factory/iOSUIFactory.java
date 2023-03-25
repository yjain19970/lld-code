package oops.designpattern.factory;

import oops.designpattern.factory.component.Button;
import oops.designpattern.factory.component.DropDown;
import oops.designpattern.factory.component.Menu;

public class iOSUIFactory implements UIFactory{
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

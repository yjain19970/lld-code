package liveclass.designpattern.factory;

import oops.designpattern.factory.UIFactory;
import oops.designpattern.factory.component.Button.AndroidButton;
import oops.designpattern.factory.component.Button.Button;
import oops.designpattern.factory.component.dropdown.AndroidDropDown;
import oops.designpattern.factory.component.dropdown.DropDown;
import oops.designpattern.factory.component.menu.AndroidMenu;
import oops.designpattern.factory.component.menu.Menu;

public class AndroidFactory implements UIFactory {
    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }

    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public AndroidDropDown createDropDown() {
        return new AndroidDropDown();
    }
}

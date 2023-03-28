package liveclass.designpattern.factory;

import liveclass.designpattern.factory.component.button.Button;
import liveclass.designpattern.factory.component.dropdown.DropDown;
import oops.designpattern.factory.component.menu.Menu;

public interface UiFactory {
    Button createButton();
    Menu createMenu();
    DropDown createDropDown();
}

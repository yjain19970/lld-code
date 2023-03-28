package oops.designpattern.factory;

import oops.designpattern.factory.component.Button.Button;
import oops.designpattern.factory.component.dropdown.DropDown;
import oops.designpattern.factory.component.menu.Menu;


//abstract factory class
public interface UIFactory {
    Button createButton();
    Menu createMenu();
    DropDown createDropDown();
}

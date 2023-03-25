package oops.designpattern.factory;

import oops.designpattern.factory.component.Button;
import oops.designpattern.factory.component.DropDown;
import oops.designpattern.factory.component.Menu;

public interface UIFactory {
    public Button createButton();
    public Menu createMenu();
    public DropDown createDropDown();
}

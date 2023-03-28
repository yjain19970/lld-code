package liveclass.designpattern.factory.component.button;

public class IOSButton implements Button {
    @Override
    public IOSButton clickButton() {
        return new IOSButton();
    }
}

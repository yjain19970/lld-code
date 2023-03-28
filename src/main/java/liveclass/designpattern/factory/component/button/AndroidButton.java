package liveclass.designpattern.factory.component.button;

public class AndroidButton implements Button {
    @Override
    public AndroidButton clickButton() {
        return new AndroidButton();
    }
}

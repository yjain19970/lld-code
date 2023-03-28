package oops.designpattern.factory;

public class Flutter {
    public void setTheme(){

    }
    public void setRefreshRate(){

    }

    // lot of methods wrt to UI, button, menu, dropdown.
    // all of these methods should go in abstract factory.
    // lets take that abstractfactory be



    // old: create_factory_1
    public UIFactory createUIFactorys(String platform){
        if(platform.equals("Android")){
            return new AndroidUIFactory();
        }else {
            return new iOSUIFactory();
        }
    }

    // new: create_factory_2
    public UIFactory createUIFactory(String platform){
        return PublicUIFactory.getUIFactoryForPlatform(platform);
    }
}

package liveclass.designpattern.factory;

import oops.designpattern.factory.UIFactory;

public class ReactNativeLibrary {


    public UIFactory createUIFactory(String platform){
        return UIFactoryFactory.getUIFactoryForPlatform(platform);
    }

}

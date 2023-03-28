package liveclass.designpattern.factory;

import oops.designpattern.factory.UIFactory;
import oops.designpattern.factory.iOSUIFactory;

/**
 * PRACTICAL FACTORY
 */
public class UIFactoryFactory {

    public static UIFactory getUIFactoryForPlatform(String platform){
        if(platform.equals("Android")){
            return new AndroidFactory();
        }else if(platform.equals("ios")){
            return new iOSUIFactory();
        }else
            return new WindowsUIFactory();

    }
}

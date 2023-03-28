package oops.designpattern.factory;

public class PublicUIFactory  {

    public static UIFactory getUIFactoryForPlatform(String platform){
        if(platform == "Android"){
            return new AndroidUIFactory();
        }else{
           return new iOSUIFactory();
        }
    }
}

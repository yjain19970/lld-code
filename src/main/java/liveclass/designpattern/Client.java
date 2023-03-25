package liveclass.designpattern;

import liveclass.designpattern.doublecheckloading.DBConnDCL;
import liveclass.designpattern.eagerLoading.DBConnEarger;

public class Client {
    public static void main(String[] args) {
        DBConnDCL x = DBConnDCL.getInstance();
        System.out.println(x);
        DBConnDCL y = DBConnDCL.getInstance();
        System.out.println(y);
    }
}

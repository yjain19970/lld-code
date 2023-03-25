package oops.class03;

import oops.class03.polym.A;
import oops.class03.polym.C;
import oops.class03.polym.NewSample;

public class InhClient {
    public static void main(String[] args) {

        NewSample n = new NewSample();

        n.doSomething();
        n.doSomething("yash");


    }
}

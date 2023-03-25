package oops.designpattern.builderpattern;

public class Client {

    public static void main(String[] args) {
        Helper sb = new Helper();
        sb.setAge(12);
        sb.setBatchName("sss");
        /*
        similarly..
         */

        Student s = new Student(sb);
        // code looks very very readable and understandable code.

    }
}

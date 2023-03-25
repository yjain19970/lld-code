package oops.class02;

import oops.class02.Student;

public class StudentClient {

    public static void main(String[] args) {
        Student s1 = new Student("Yash", 2, "X",1.0F);

        System.out.println(s1);
        Student s2 = new Student(s1);
        System.out.println(s2);
        Student s3 = s2;
        System.out.println(s3);

        s3.batchId = 1; // will it change the name of S2 as well?

        s2.batchId = 9; // will it change the name in s1?



    }
}

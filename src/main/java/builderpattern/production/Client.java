package builderpattern.production;

public class Client {

    public static void main(String[] args) {
        /**
         *  Builder b = Student.getBuilder();
         *  b.setAge();
         *  b.setName();
         *
         *  Student st = b.build();
         *
         *  COMPARE THIS SECTION OF CODE WITH BELOW CODE... WHICH LOOKS BETTER?
         */

        Student stt = Student.getBuilder()
                .setAge(12)
                .setName("")
                .setUniversityName("")
                .build();

        System.out.println(stt.age);
        // very very good

    }
}

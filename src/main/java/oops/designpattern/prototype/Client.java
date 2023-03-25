package oops.designpattern.prototype;

public class Client {
    public static void fillRegistry(StudentRegistry registry){

        Student april_21_batch_student = new Student();
        april_21_batch_student.setBatch("april_21");
        april_21_batch_student.setAvgBatchPsp(21);
        registry.register("april21_batch", april_21_batch_student);

        IntelligentStudent aprBatchIntelligentStudent = new IntelligentStudent();
        aprBatchIntelligentStudent.iq = 180;
        aprBatchIntelligentStudent.setBatch("April 21");

        registry.register("aprBatchIntelligentStudent", aprBatchIntelligentStudent);
    }

    public static void main(String[] args) {
        StudentRegistry studentRegistry   = new StudentRegistry();
        fillRegistry(studentRegistry);

        // creating a student sid and make a clone.
        Student x = studentRegistry.get("april21_batch").clone(); // can use enum and constant for name
        x.name = "YAsh";
        x.age = 23;

        // now till everyone clear.

        Student sid = studentRegistry.get("april");
        sid.setBatch("dsds");
        sid.setAge(11);

        System.out.println("DEBUG"); // debug both x and sid



    }
}

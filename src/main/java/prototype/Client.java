package prototype;

public class Client {
    public static void fillRegistry(StudentRegistry registry){

//        Student april_21_batch_student = new Student(this);
//        april_21_batch_student.setBatch("april_21");
//        april_21_batch_student.setAvgBatchPsp(21);
//        registry.register("april21_batch", april_21_batch_student);
    }

    public static void main(String[] args) {
        StudentRegistry studentRegistry   = new StudentRegistry();
        fillRegistry(studentRegistry);

        // creating a student sid and make a clone.
        Student x = studentRegistry.get("april21_batch").clone(); // can use enum and constant for name
        x.name = "YAsh";
        x.age = 23;

        // now till everyone clear.



    }
}

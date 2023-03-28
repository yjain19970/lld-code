package liveclass.designpattern.prototypeRegistry;

public class Client {
    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();
        fillRegistry(registry);
        // create copy of the prototypes....
        Student x = registry.get("april_23").clone();
        x.setAge(12);
        x.setName("Yash");
    }


    private static void fillRegistry(StudentRegistry registry) {
        Student march_23_batch = new Student();
        march_23_batch.setBatchName("march_23");
        march_23_batch.setAvgBatchPsp(87);

        registry.register("march_23_batch", march_23_batch);

        Student april_23_batch = new Student();
        april_23_batch.setBatchName("april_23");
        april_23_batch.setAvgBatchPsp(87);
        registry.register("april_23_batch", march_23_batch);

    }
}

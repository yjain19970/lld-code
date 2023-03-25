package liveclass.designpattern.prototypeRegistry;

public class Student implements Prototype<Student>{

    private String name;
    private int age;
    private int avgBatchPsp;
    private String batchName;

    public Student(){}

    @Override
    public Student clone() {
        return new Student(this);
    }

    public Student(Student s){
        this.age = s.age;
        this.name = s.name;
        this.batchName = s.batchName;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAvgBatchPsp() {
        return avgBatchPsp;
    }

    public void setAvgBatchPsp(int avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }
}

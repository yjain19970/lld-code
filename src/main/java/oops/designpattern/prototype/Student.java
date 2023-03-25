package oops.designpattern.prototype;

public class Student implements Prototype<Student> {
    int age;
    int avgBatchPsp;
    String batch;
    String name;



    public Student() {}

    public Student(Student student) {
        this.age = student.age;
        this.name = student.name;
        this.batch = student.batch;
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

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}

package oops.class02;

public class Student {
    public String name;
    public int batchId = 10;
    public float psp;
    public String univName = "XYA";

    public Student(){

    }

    public Student(Student existing){
        name = existing.name;
        batchId = existing.batchId;
        psp = existing.psp;
        univName = existing.univName;
    }









    public Student(String inputName, int inputBatchId){
        name = inputName;
        batchId = inputBatchId;
    }

    public Student(String inputName, int inputBatchId, String univName, Float psp){
        name = inputName;
        batchId = inputBatchId;
        psp = psp;
        univName = univName;
    }




}

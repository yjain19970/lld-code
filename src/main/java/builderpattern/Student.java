package builderpattern;

public class Student {
    private String name;
    private int age;
    private double psp;
    private String univName;
    private String batchName;
    private long id;
    private int gradYear;
    private String phoneNo;
    /**
     * we need to create object of this student
     * 1. to create constructor, some problems. Instead we would go with
     * 2. we would create Helper...
     */
    Student(Helper h) {
        if (h.getGradYear() > 2022){
            throw new IllegalArgumentException("sds");
        }

        // validation completes.
        this.age = h.getAge();
        this.batchName = h.getBatchName();
        // similrly...

        System.out.println("ADD DEBUGGER");
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

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public String getUnivName() {
        return univName;
    }

    public void setUnivName(String univName) {
        this.univName = univName;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}

package liveclass.builderdesignpattern;

public class Student {
    private String name;
    private String email;
    private int age;
    private double psp;
    private String phoneNo;

    public static Helper getBuilder(){
        return new Helper();
    }

    private Student(Helper h){
        this.name = h.getName();
        this.email = h.getEmail();
        this.age = h.getAge();
        this.psp = h.getPsp();
        this.phoneNo = h.getPhoneNo();
    }

public static class Helper {
        private String name;
        private String email;
        private int age;
        private double psp;
        private String phoneNo;

        public Student build(){
//            if(this.getAge() > 100){
//                throw new IllegalArgumentException();
//            }
//            if(this.getPhoneNo() !=null && this.getPhoneNo().length() <10){
//                throw new IllegalArgumentException();
//            }
            return new Student(this);
        }

        public String getName() {
            return name;
        }

        public Helper setName(String name) {
            this.name = name;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public Helper setEmail(String email) {
            this.email = email;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Helper setAge(int age) {
            this.age = age;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Helper setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getPhoneNo() {
            return phoneNo;
        }

        public Helper setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }
    } // helper end
} // student end

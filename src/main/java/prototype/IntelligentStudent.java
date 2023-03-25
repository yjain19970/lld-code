package prototype;

public class IntelligentStudent extends Student{
    int iq;
    //potentially lead to problems



    public IntelligentStudent(IntelligentStudent s){
        // how do you think what it should do?
        super(s);
        this.iq = s.iq;
    }

//    @Override
//    public IntelligentStudent clone() {
//        IntelligentStudent st = new IntelligentStudent();
//        st.iq = this.iq;
//
//        // how to implement?
//        return super.clone();
//    }

//    @Override
//    public IntelligentStudent clone() {
//        return new IntelligentStudent(this);
//    }
    // actually works.
}

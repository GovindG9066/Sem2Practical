package Feb_23;

public class Studentaccess {
    public static void main(String[] args) {
        Student st=new Student();
        st.setRollNo(15);
        st.setName("Govind");

        System.out.println(st.getRollNo());
        System.out.println(st.getName());
    }
}

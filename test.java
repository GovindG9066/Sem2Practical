public class test {
    public static void main(String[] args) {
        Student s=new Student();
        s.setRollno(18);
        s.setName("Govind");
        System.out.println(s.getRollno());
        System.out.println(s.getName());

        Student st=new Student();
        st.setName("Krishna");
        st.setRollno(15);

        System.out.println(st.getRollno());
        System.out.println(st.getName());

        Course C=new Course();
        C.setCid(111);
        C.setCname("MCA");

        System.out.println(C.getCid());
        System.out.println(C.getCname());
    }
}

public class StudentAddressDemo {
    public static void main(String[] args) {
        Address ad=new Address();
        ad.setAreaName("Baramati");
        ad.setCityName("Pune");

        Student1 s1=new Student1();
        s1.setRollNo(12);
        s1.setName("Krishna");
        s1.setAdr(ad);

        System.out.println("Roll No :"+s1.getRollNo());
        System.out.println("Name :"+s1.getName());
        System.out.println("Area Name :"+s1.getAdr().getAreaName());
        System.out.println("City Name :"+s1.getAdr().getCityName());
    }
}

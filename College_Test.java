public class College_Test {
    public static void main(String[] args) {
        College clg=new College();
        clg.setCid(111);
        clg.setCname("VIIT");
        clg.setCaddress("Baramati");
        clg.setEmail("viit123@gmail.com");
        clg.setPincode(123452);

        System.out.println("College Id :"+clg.getCid());
        System.out.println("College Name :"+clg.getCname());
        System.out.println("College Address :"+clg.getCaddress());
        System.out.println("College Email :"+clg.getEmail());
        System.out.println("College Pin-Code :"+clg.getPincode());
    }
}

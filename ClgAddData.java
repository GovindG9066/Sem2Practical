public class ClgAddData {
    public static void main(String[] args) {
        Address1 ad1=new Address1();
        ad1.setAreaname("Baramati");
        ad1.setCityname("Pune");
        ad1.setLocation("Vidyanagari");

        College1 clg=new College1();
        clg.setCid(123);
        clg.setCname("VIIT");
        clg.setCEmail("Viit12@gmail.com");
        clg.setPincode(124563);
        clg.setAdr(ad1);

        System.out.println("----------------------------");
        System.out.println("Clg Id :"+clg.getCid());
        System.out.println("Clg Name :"+clg.getCname());
        System.out.println("Clg Email :"+clg.getCEmail());
        System.out.println("Clg PinCode :"+clg.getPincode());
        System.out.println("Clg Address :");
        System.out.println("City Name :"+clg.getAdr().getCityname());
        System.out.println("Area Name :"+clg.getAdr().getAreaname());
        System.out.println("Location :"+clg.getAdr().getLocation());
        System.out.println("----------------------------");
    }
}

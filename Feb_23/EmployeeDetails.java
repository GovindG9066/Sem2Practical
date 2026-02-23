package Feb_23;

class emp{
    String name;
    int id;
    int sal;

    public emp(String name, int id, int sal) {
        this.name = name;
        this.id = id;
        this.sal = sal;
    }

    void displayempdetails(){
        System.out.println("---------------------");
        System.out.println("Employee details :");
        System.out.println("Name:"+name);
        System.out.println("Id:"+id);
        System.out.println("Salary:"+sal);
    }

    void bonus(){
        System.out.println("----------------------");
        int parcent=(sal/10)*12;
        System.out.println("Yearly Bonuse is  : ");
        System.out.println(parcent);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        emp e1=new emp("Krishna",102,500);
        e1.displayempdetails();
        e1.bonus();
        e1.displayempdetails();
    }
}

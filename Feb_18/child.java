package Feb_18;
import java.util.Scanner;

class parent1{
    public void add(int a,int b){
        System.out.println(a+b);
    }
}
class child1 extends parent1{
    public void result(){
        Scanner sc =new Scanner(System.in);


        System.out.println("Enter First Number :");
        int a=sc.nextInt();

        System.out.println("Enter Second Number :");
        int b=sc.nextInt();

        System.out.println("Addition is :");
        add(a,b);
    }
}

public class child {
    public static void main(String[] args) {

        child1 c1=new child1();
        c1.result();
    }
}

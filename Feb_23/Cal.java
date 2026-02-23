package Feb_23;
interface Oper{
    void add(int a,int b);
    void sub(int a,int b);
    void mul(int a,int b);
    void div(int a,int b);
}

class calculator implements Oper{
    @Override
    public void div(int a, int b) {
        System.out.println("Div:"+ (a/b));
    }

    @Override
    public void mul(int a, int b) {
        System.out.println("Mul:"+ (a*b));
    }

    @Override
    public void sub(int a, int b) {
        System.out.println("Sub:"+ (a-b));
    }

    @Override
    public void add(int a, int b) {
        System.out.println("Add:"+ (a+b));
    }

}
public class Cal {
    public static void main(String[] args) {
        calculator cl=new calculator();
        cl.add(5,4);
    }
}


package Feb_18;


class P1{
    public void add(int a,int b){
        System.out.println(a+b);
    }
}
class C1 extends P1{
    public void result(){
        add(7,8);
    }
}

public class Inter {
    public static void main(String[] args) {
        C1 child=new C1();
        child.result();
    }
}

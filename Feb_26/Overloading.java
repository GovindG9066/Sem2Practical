package Feb_26;

class Arithmatic{
    public int add(int a,int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }
    public int add(int x,int y,int z){
        return x+y+z;
    }
    public String add(String a,String b){
        return a+b;
    }
}

public class Overloading {
    public static void main(String[] args) {
        Arithmatic at=new Arithmatic();
        System.out.println(at.add(5,4));
        System.out.println(at.add(5.1,4));
        System.out.println(at.add(5,4,9));
        System.out.println(at.add("Govind"," Gadekar"));
    }
}

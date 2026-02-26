package Feb_26;

class Animal{
    public void Sound(){
        System.out.println("Animal Sound");
    }
}
class Dog extends  Animal{
    @Override
    public void Sound(){
        System.out.println("Dog Bark");
    }
}

public class Demo {
    public static void main(String[] args) {
        Animal A=new Dog();
        Animal Ab=new Animal();
        Ab.Sound();
        A.Sound();
    }
}

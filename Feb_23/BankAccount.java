package Feb_23;

class Bank{
    int acNo;
    String acHolder;
    int bal;

    public Bank(int acNo,String acHolder,int bal){
        this.acNo=acNo;
        this.acHolder=acHolder;
        this.bal=bal;
    }

    void deposit(int money){
        System.out.println("-------------------------");
        bal+=money;
        System.out.println("The Amount "+money+" deposited to the account");
    }
    void  withdraw(int money){
        System.out.println("-------------------------");
        bal-=money;
        System.out.println("The Amount "+money+" is withdraw from the account");
    }
    void display(){
        System.out.println("-------------------------");
        System.out.println("Account details...");
        System.out.println("Account No:"+acNo);
        System.out.println("Account Holder:"+acHolder);
        System.out.println("Available Balance:"+bal);
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Bank b1=new Bank(123,"Govind",5700);
        b1.display();
        b1.deposit(300);
        b1.display();
        Bank b2=new Bank(137,"Om",7900);
        b2.display();
        b2.withdraw(300);
        b2.display();
    }
}

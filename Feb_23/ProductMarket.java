package Feb_23;
import java.util.Scanner;
class Product{
    String name;
    int id;
    double price;
    int quentity;

    public Product(String name, int id, double price, int quentity) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.quentity = quentity;
    }

    void display(){
        System.out.println("Display All Products :");
        System.out.println("Name :"+name);
        System.out.println("Id :"+id);
        System.out.println("Price :"+price);
        System.out.println("Quentity :"+quentity);
    }

    void UpdateStock(int choice,int newStock){

        if(choice==1){
            quentity+=newStock;
        } else if (choice==2) {
            quentity-=newStock;
        }else {
            System.out.println("Not Correct choice please try again");
        }
    }
    void CalculateTotal(){
        System.out.println("Total Value of product :"+(quentity*price));
    }
}

public class ProductMarket {
    public static void main(String[] args) {
        Product p1=new Product("Phone",125,8000,12);
        p1.display();
        System.out.println("--------------------------------");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Choice :");
        System.out.println("Press 1 for add new Stock");
        System.out.println("Press 2 for remove the Stock");
        System.out.println("--------------------------------");

        System.out.println("Enter the Choice :");
        int choice=sc.nextInt();
        System.out.println("Enter New Stock :");
        int newStock=sc.nextInt();
        p1.UpdateStock(choice,newStock);
        System.out.println("--------------------------------");

        p1.display();
        System.out.println("--------------------------------");

        p1.CalculateTotal();
        System.out.println("--------------------------------");


    }
}
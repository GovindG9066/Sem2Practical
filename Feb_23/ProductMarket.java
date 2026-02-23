//package Feb_23;
//
//import java.util.Scanner;
//
//class product{
//    String name;
//    int id, price,quentity;
//    public product(String name,int id,int price,int quentity){
//        this.name=name;
//        this.id=id;
//        this.price=price;
//        this.quentity=quentity;
//    }
//    void display(){
//        System.out.println("Product Details:");
//        System.out.println("Name of the product :"+name);
//        System.out.println("Id of the product :"+id);
//        System.out.println("Price of the product :"+price);
//        System.out.println("Quentity of the product :"+quentity);
//    }
//    class invalidinput extends Exception{
//        invalidinput(String msg){
//            super(msg);
//        }
//
//    }
//    void updateStock(int addreduce,int newQuentity){
//        try {
//            if(addreduce==1){
//
//                if(addreduce>quentity) {
//                    throw new invalidinput("input out of bount");
//                }else{
//                    System.out.println("Reduce quentity is :"+newQuentity);
//                    quentity-=newQuentity;
//                }
//            }
//            } else if (addreduce==2) {
//                System.out.println("Add quentity is :"+newQuentity);
//            }else {
//                throw new invalidinput("Enter valid input");
//            }
//        }catch (invalidinput e){
//            System.out.println(e.getMessage());
//        }
//    }
//}
//
//public class ProductMarket {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//
//    }
//}

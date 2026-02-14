import java.util.Scanner;
public class Operations{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Number: ");
		int num1=sc.nextInt();
		System.out.println("Enter the Second Number : ");
		int num2=sc.nextInt();
		
		System.out.println("Enter the operatar : ");
		System.out.println("Choose From 1,2,3,4");
		int oper=sc.nextInt();
		switch(oper){
			case 1:
				System.out.println("Addition : "+num1+num2);
			break;

			case 2:
				System.out.println("Subtraction : "+ (num1- num2));
			break;

			case 3:
				System.out.println("Multiplication :"+num1*num2);
			break;

			case 4:
				System.out.println("Division : "+num1/num2);
			break;
			
			default:
				System.out.println("Choose correct Choice...");
		}

		

	}
}
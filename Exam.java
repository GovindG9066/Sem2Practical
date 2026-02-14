import java.util.Scanner;

public class Exam{

	public static void Seat(){
		System.out.println("Candidate Name : ABC");
		System.out.println("Your Result:Pass");
		System.out.println("Subject:4");
		System.out.println("Java:60");
		System.out.println("Python:41");
		System.out.println("C++:92");
		System.out.println("DSA:72");
		System.out.println("Percentage:"+ (((60+41+92+72)*100)/400));
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Seat Number :");
		int SeatNo=sc.nextInt();
		System.out.println("Enter Your Mother Name :");
		
		String MotherName=sc.next();
		
		if( (SeatNo==512) && (MotherName.equals("xyz"))){
			System.out.println("Your Result :");
			Seat();
		}else{
			System.out.println("Seat No and Mother Name not match...");
		}
		
	}

}
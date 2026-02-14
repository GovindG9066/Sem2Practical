public class RMS{
	public static void main(String[]args){
		int marks=50;

		if (marks>=75){
			System.out.println("Distinction");
		}
		else if (marks>=60 && marks <75){
			System.out.println("First Class");
		}
		else if (marks>=35 && marks <60){
			System.out.println("Pass");
		}
		else{
			System.out.println("Fail");
		}
	}	
}
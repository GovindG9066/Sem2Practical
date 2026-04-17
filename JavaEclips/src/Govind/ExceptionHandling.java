package Govind;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling  {
	void eh1(int age) throws invalidAgeException, ageOutOfBoundException {
		if(age<=17) {
			throw new invalidAgeException();
		}else if (age>=100) {
			throw new ageOutOfBoundException();
		}else {
			System.out.println("Age is Valid You are Young...");
		}
	}
	public static void main(String[] args) {
		
		try {
			ExceptionHandling eh=new ExceptionHandling();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Your Age:");
			eh.eh1(sc.nextInt());
		}catch(invalidAgeException e) {
			System.out.println("You are Child");
		}catch(ageOutOfBoundException e) {
			System.out.println("Age Out of Bound please Enter Correct Age");
		}catch(InputMismatchException e) {
			System.out.println("Enter Only Number...");
		}finally {
			System.out.println("CODE IS FINISHED...");
			
		}
		
	}
	public class invalidAgeException extends Exception{
		public invalidAgeException() {
			
		}
		
	}
	public class ageOutOfBoundException extends Exception{
		public ageOutOfBoundException() {
			
		}
	}
}

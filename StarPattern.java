public class StarPattern{
	public static void main(String[]args){
		System.out.println("Simple Star Pattern Program....");
		for(int i=1;i<=5;i++){
			
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("Up side down simple right angle triangle :");
		for(int i=1;i<=5;i++){
			for(int j=5;j>=i;j--){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
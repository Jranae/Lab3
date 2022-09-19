import java.util.Scanner; 
public class MilePerGallon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Miles : ");
		int miles = scan.nextInt();
		System.out.println("Enter Gallons in the tank : ");
		int gallons = scan.nextInt();
		
		double mpg = miles / gallons;
		System.out.println("The MPG is : " + mpg);
		
		
	}

}

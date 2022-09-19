import java.util.Scanner;

public class FloatMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter float f1 : ");
		float f1 = scan.nextFloat();
		System.out.println("Enter float f2 : ");
		float f2 = scan.nextFloat();
		
		f1 += f2;
		System.out.println("The sum is " + f1);
		f1 -= f2;
		System.out.println("The difference is " + f1);
		f1 *= f2;
		System.out.println("The product is " + f1);
		
	
		
		
	}

}

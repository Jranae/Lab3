import java.util.Scanner;

public class IntAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Number 1 : ");
		int number1 = scan.nextInt();
		
		System.out.println("Enter Number 2 : ");
		int number2 = scan.nextInt();
		
		System.out.println("Enter Number 3 : ");
		int number3 = scan.nextInt();
		
		int sum = number1+number2+number3;
		int average = sum / 3;
		System.out.println("The average is " + average);
		
	}

}

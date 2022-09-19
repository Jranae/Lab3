
public class Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] Days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		System.out.println("Day1 : " + Days[0]);
		System.out.println("Day2 : " + Days[1]);
		System.out.println("Day3 : " + Days[2]);
		System.out.println("Day4 : " + Days[3]);
		System.out.println("Day5 : " + Days[4]);
		System.out.println("Day6 : " + Days[5]);
		System.out.println("Day7 : " + Days[6]);
		
		Days[5]= "Holiday";
		System.out.println("Day6 : " + Days[5]);
		Days[6]= "Holiday";
		System.out.println("Day7 : " + Days[6]);
		
		System.out.println(Days.length);
		
		
		
		
		
		
		
	}

}

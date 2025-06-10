package MyPackage;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Maths = 20;
		int Science = 39;
		int English = 40;
		int Total_Marks = (Maths + Science+ English);
		int Average = ((Total_Marks)/3);
		System.out.println("Average Marks " + Average );
		
		if (Average >= 90)
		{
			System.out.println("A+");
			System.out.println("Excellent Performance");
		}
		else if (Average >=75)
		{
			System.out.println("A");
			System.out.println("Excellent Performance");}
		else if (Average >= 60)
		{
			System.out.println("B");
			System.out.println("Keep Improving");}
			
		else if (Average >= 40)
		{
			System.out.println("C");
			System.out.println("Keep Improving");}
		else if (Average <40)
		{
			System.out.println("F");
			System.out.println("Fail");
			if (Average <35)
			{
				System.out.println("Failed due to low score in at least one subject.");}
			
		}
	

	}

}

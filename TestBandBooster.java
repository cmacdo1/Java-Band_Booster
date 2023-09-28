import java.util.Scanner;

public class TestBandBooster
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		// create 2 BandBooster objects
		System.out.print("Enter booster name #1: ");
		String name1 = scan.nextLine();
		BandBooster boost1 = new BandBooster(name1);
		
		System.out.print("Enter booster name #2: ");
		String name2 = scan.nextLine();
		BandBooster boost2 = new BandBooster(name2);
		
		// get info for three weeks
		for( int i = 0; i < 3; i++)
		{
			System.out.print("Enter the number of boxes sold by "
					+ boost1.getName() + " this week: ");
			
			int boxes1 = scan.nextInt();
			boost1.updateSales(boxes1);
			
			System.out.print("Enter the number of boxes sold by "
					+ boost2.getName() + " this week: ");
			
			int boxes2 = scan.nextInt();
			boost2.updateSales(boxes2);
			
			System.out.println();
		}
		
		// show final results
		System.out.println(boost1);
		System.out.println(boost2);
		
		scan.close();
	}

}

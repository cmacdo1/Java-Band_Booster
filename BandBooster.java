public class BandBooster
{
	// attributes
	private String name;
	private int boxesSold;
	
	// constructor
	public BandBooster( String name )
	{
		this.name = name;
		boxesSold = 0;
	}
	
	// behavior
	public void updateSales ( int addlBoxes)
	{
		boxesSold += addlBoxes;
	}
	
	public String toString()
	{
		return name + ": " + boxesSold + " boxes"; 
	}
	
	// getters & setters
	public String getName()
	{
		return name;
	}
}

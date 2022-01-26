public class Sofa extends Furniture implements IFurniture 
{
	private int price;
	private double discountedPrice;
	
	public Sofa()
	{
		super();
	}
	
	@Override
	public double calculateDiscountedPrice() 
	{
		discountedPrice= price-((discountPercentageHome)*price);
		// TODO Auto-generated method stub
		return discountedPrice;
	}
	@Override
	public void displayFurnitureDetails() {
		// TODO Auto-generated method stub
		
	}
	
    // Specify attributes for Sofa
   // define constructors, ensure the super keyword is used

}


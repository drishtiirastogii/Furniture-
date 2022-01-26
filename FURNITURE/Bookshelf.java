public class Bookshelf extends Furniture implements IFurniture 
{	
	private int price;
	private double discountedPrice;
	
	public Bookshelf() 
	{
		super();
	}

	@Override
	public double calculateDiscountedPrice() 
	{	
		discountedPrice= (price-(discountPercentageOffice)*price);
		// TODO Auto-generated method stub
		return discountedPrice;
	}

	@Override
	public void displayFurnitureDetails() {
		// TODO Auto-generated method stub
		
	}
	
}
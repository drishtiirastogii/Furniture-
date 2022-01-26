public class Table extends Furniture implements IFurniture 
{
	private int price;
	private double discountedPrice;
	
	public Table()
	{
		super();
	}
	
	@Override
	public double calculateDiscountedPrice() 
	{
		discountedPrice= price- ((discountPercentageGarden)*price);
		// TODO Auto-generated method stub
		return discountedPrice;
	}
	@Override
	public void displayFurnitureDetails() 
	{
		// TODO Auto-generated method stub
		
	}
	
    // specify attributes for Table
    // define constructors, ensure the super keyword is used

}

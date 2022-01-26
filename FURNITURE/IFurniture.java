public interface IFurniture 
{	
	
    // define the discount percentage for various furniture types  
	// 10% for the office furniture, 5% for the home furniture, 2.5% for the garden furniture.**
	double discountPercentageOffice=0.1;
	double discountPercentageHome=0.05;
	double discountPercentageGarden=0.025;
    // define common methods like calculateDiscountedPrice and display furniture details
	public double calculateDiscountedPrice();
	
	public void displayFurnitureDetails();
	
	
}
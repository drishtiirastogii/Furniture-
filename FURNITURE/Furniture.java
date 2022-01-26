public class Furniture 
{ 
	private String color;
	private int price;
	private double discountedPrice; 
	private String furnitureType;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getFurnitureType() {
		return furnitureType;
	}
	public void setFurnitureType(String furnitureType) {
		this.furnitureType = furnitureType;
	}
	public double getDiscountedPrice() {
		return discountedPrice;
	}
	public void setDiscountedPrice(double discountedPrice) {
		this.discountedPrice = discountedPrice;
	}
	public void method1() 
	{
		System.out.println("Furniture Type="+this.furnitureType+"\n"+"Colour of furnitutre="+this.color+"\n"+"Price of furniture="+this.price
				+"\n"+"Discounted Price="+this.discountedPrice);
	}
	
}


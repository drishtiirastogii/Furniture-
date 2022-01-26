import java.util.Scanner;

public class FurnitureDemo
{

	public static void main(String[] args) 
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER YOUR CHOICE OF FURNITURE:"+"\n"+
						   "1.OFFICE FURNITURE"+"\n"+"2.GARDEN FURNITURE"+"\n"+"3.HOME FURNITURE");
		int choice=sc.nextInt();
		if(choice==1)
		{
		Bookshelf b=new Bookshelf();
		b.setColor("Blue");
		b.setPrice(500);
		b.setFurnitureType("Office Furniture");
		b.setDiscountedPrice(450);
		b.method1();
		}
		else if(choice==2)
		{
		Table t=new Table();
		t.setColor("White");
		t.setPrice(800);
		t.setFurnitureType("Garden Furniture");
		t.setDiscountedPrice(780);
		t.method1();
		}
		else if(choice==3)
		{	
		Sofa s=new Sofa();
		s.setColor("GOLDEN");
		s.setPrice(5000);
		s.setFurnitureType("Home Furniture");
		s.setDiscountedPrice(4750);
		s.method1();
		}
		
		else
		{
			System.out.println("INVALID INPUT");
		}
        // Declare Objects for the furniture Bookshelf, Table and Sofa
        // Ensure that the super type refers to the sub classes
        // Display the details of each of them
		
	}

}
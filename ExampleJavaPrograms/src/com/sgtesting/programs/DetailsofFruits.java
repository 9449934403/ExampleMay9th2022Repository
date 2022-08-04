package com.sgtesting.programs;

class Fruits{
	String Fruitname;
	int Price;
	int Weight;
	String Place;
}
class Flowers{
	String Flowername;
	int Price;
	String Place;
	int quantity;
}
class Vegitables{
	String Vegitablename;
	int Price;
	String Place;
	int Quantity;
}
public class DetailsofFruits {  
	public static void main(String[] args) {
	Fruits Apple=new Fruits();
	Apple.Fruitname="Apple";
	Apple.Price=220;
	Apple.Weight=1;
	Apple.Place="Kashmira";
	System.out.println("Fruitname:"+Apple.Fruitname);
	System.out.println("Price:" +Apple.Price);
	System.out.println("Weight:" +Apple.Weight);
	System.out.println("Place:" +Apple.Place);
	System.out.println("++++++");
	Flowers Rose= new Flowers();
	Rose.Flowername="Rose";
	Rose.Price=500;
	Rose.Place= "Karnataka";
	Rose.quantity= 20;
	System.out.println("Flowername:"+Rose.Flowername);
	System.out.println("Price:"+Rose.Price);
	System.out.println("Place:"+Rose.Place);
	System.out.println("quantity:"+Rose.quantity);
	System.out.println("+++++++");
	Vegitables Cucumber = new Vegitables();
	Cucumber.Vegitablename="Cucumber";
	Cucumber.Price=20;
	Cucumber.Place="Kolar";
	Cucumber.Quantity=5;
	System.out.println("Vegitablename:"+Cucumber.Vegitablename);
	System.out.println("price:"+Cucumber.Price);
	System.out.println("Place:"+Cucumber.Place);
	System.out.println("Quantity:"+Cucumber.Quantity);
		
	}

}
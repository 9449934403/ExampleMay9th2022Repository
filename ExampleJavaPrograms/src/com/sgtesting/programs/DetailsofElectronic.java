package com.sgtesting.programs;

class Desktop{
	String Desktopname;
	int Model;
	int Price;
	String country;
	public String Desktop;
}
class Laptop{
	String LaptopName;
	int Price;
	String State;
	int Model;
	public String Laptop;
}
class AndroidDevice{
	String Phonename;
	int Price;
	String Country;
	int Model;
	public String phonename;
}
public class DetailsofElectronic {  
	public static void main(String[] args) {
	Desktop HP=new Desktop();
	HP.Desktopname="HP";
	HP.Model=2022;
	HP.Price=45000;
	HP.country="India";
	System.out.println("Desktopname:"+HP.Desktopname);
	System.out.println("Model:" +HP.Model);
	System.out.println("Price:" +HP.Price);
	System.out.println("country:" +HP.country);
	System.out.println("++++++");
	Laptop Dell = new Laptop();
	Dell.LaptopName="Dell";
	Dell.Price=54000;
	Dell.State= "Karnataka";
	Dell.Model= 2007;
	System.out.println("LaptopName:"+Dell.LaptopName);
	System.out.println("Price:"+Dell.Price);
	System.out.println("State:"+Dell.State);
	System.out.println("Model:"+Dell.Model);
	System.out.println("+++++++");
	AndroidDevice Iphone = new AndroidDevice();
	Iphone.Phonename="Iphone";
	Iphone.Price=110000;
	Iphone.Country="USA";
	Iphone.Model=2020;
	System.out.println("Phonename:"+Iphone.phonename);
	System.out.println("Price:"+Iphone.Price);
	System.out.println("Country:"+Iphone.Country);
	System.out.println("Model:"+Iphone.Model);
		
	}

}

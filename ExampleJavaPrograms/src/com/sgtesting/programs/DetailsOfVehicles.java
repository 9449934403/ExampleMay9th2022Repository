package com.sgtesting.programs;

class FourWheeler{
	String CarName;
	int Model;
	int Price;
	String Company;
}
class TwoWheeler{
	String BikeName;
	int Price;
	String Fuel;
	int Model;
}
class HeavyVehicles{
	String HeavyVehicleName;
	int Price;
	String Company;
	int Model;
}
public class DetailsOfVehicles {  
	public static void main(String[] args) {
	FourWheeler obj1=new FourWheeler();
	obj1.CarName="Creta";
	obj1.Model=2021;
	obj1.Price=1500000;
	obj1.Company="Hondai";
	System.out.println("CarName:"+obj1.CarName);
	System.out.println("Model:" +obj1.Model);
	System.out.println("Price:" +obj1.Price);
	System.out.println("Company:" +obj1.Company);
	System.out.println("++++++");
	TwoWheeler Hero = new TwoWheeler();
	Hero.BikeName="Hero";
	Hero.Price=45000;
	Hero.Fuel= "Petrol";
	Hero.Model= 1997;
	System.out.println("Bikename:"+Hero.BikeName);
	System.out.println("Price:"+Hero.Price);
	System.out.println("Fuel:"+Hero.Fuel);
	System.out.println("Model:"+Hero.Model);
	System.out.println("+++++++");
	HeavyVehicles Bus = new HeavyVehicles();
	Bus.HeavyVehicleName ="HeavyVehicles";
	Bus.Price=1100000;
	Bus.Company="TATA";
	Bus.Model=2017;
	System.out.println("HeavyVehicleName:"+Bus.HeavyVehicleName);
	System.out.println("price:"+Bus.Price);
	System.out.println("Company:"+Bus.Company);
	System.out.println("Model:"+Bus.Model);
		
	}

}

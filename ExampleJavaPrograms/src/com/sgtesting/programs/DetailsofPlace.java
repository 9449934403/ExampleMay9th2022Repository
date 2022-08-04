package com.sgtesting.programs;

class Country{
	String Countryname;
	int population;
	int KMs;
	String Maincity;
}
class State{
	String Statename;
	int Population;
	String Maincity;
	int KMs;
}
class District{
	String Districtname;
	int Population;
	String Maincity;
	int KMs;
}
public class DetailsofPlace {  
	public static void main(String[] args) {
	Country India=new Country();
	India.Countryname="India";
	India.population=130;
	India.KMs=12000;
	India.Maincity="Delhi";
	System.out.println("Countryname:"+India.Countryname);
	System.out.println("population:" +India.population);
	System.out.println("KMs:" +India.KMs);
	System.out.println("Maincity:" +India.Maincity);
	System.out.println("++++++");
	State Karnataka= new State();
	Karnataka.Statename="Karnataka";
	Karnataka.Population=7500000;
	Karnataka.Maincity= "bangaalore";
	Karnataka.KMs= 2500;
	System.out.println("Statename:"+Karnataka.Statename);
	System.out.println("Population:"+Karnataka.Population);
	System.out.println("Maincity:"+Karnataka.Maincity);
	System.out.println("KMs:"+Karnataka.KMs);
	System.out.println("+++++++");
	District Shimoga= new District();
	Shimoga.Districtname="Shimoga";
	Shimoga.Population=1500000;
	Shimoga.Maincity="Thirthahalli";
	Shimoga.KMs=200;
	System.out.println("Districtname:"+Shimoga.Districtname);
	System.out.println("Population:"+Shimoga.Population);
	System.out.println("Maincity:"+Shimoga.Maincity);
	System.out.println("KMs:"+Shimoga.KMs);
		
	}

}
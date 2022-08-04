package com.sgtesting.programs;

class StudentLibrarySport {
	String studentname;
	int age;
	int year;
	String college;
}
class Library{
	String studentname;
	int numberofbooks;
	String language;
	int price;
}
class Sports{
	String sportname;
	int numberofplayers;
	String captainname;
	String playgroundname;
}
public class StudentLibrarySports{  
	public static void main(String[] args) {
	StudentLibrarySport obj1=new StudentLibrarySport();
	obj1.studentname="Sanjaya";
	obj1.age=20;
	obj1.year=2017;
	obj1.college="SGIT";
	System.out.println("Studentname:"+obj1.studentname);
	System.out.println("Age:" +obj1.age);
	System.out.println("Year:" +obj1.year);
	System.out.println("College:" +obj1.college);
	System.out.println("++++++");
	Library rama = new Library ();
	rama.studentname="Rama";
	rama.numberofbooks=4;
	rama.language= "Kannada";
	rama.price= 250;
	System.out.println("Studentname:"+rama.studentname);
	System.out.println("Numberofbooks:"+rama.numberofbooks);
	System.out.println("Language:"+rama.language);
	System.out.println("Price:"+rama.price);
	System.out.println("+++++++");
	Sports cricket = new Sports();
	cricket.sportname="Cricket";
	cricket.numberofplayers=11;
	cricket.captainname="Virat";
	cricket.playgroundname="kanteerava";
	System.out.println("sportname:"+cricket.sportname);
	System.out.println("numberofplayers:"+cricket.numberofplayers);
	System.out.println("captainname:"+cricket.captainname);
	System.out.println("playgroundname:"+cricket.playgroundname);
		
	}

}

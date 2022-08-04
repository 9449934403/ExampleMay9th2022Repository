package com.sgtesting.programs;

class Employee{
	String Employeename;
	int Salary;
	String Place;
	String Company;
}
class Department{
	String Departmentname;
	int Empcount;
	String Company;
	int Salary;
}
class Insurance{
	String Insurancename;
	int Premium;
	String City;
	int Users;
}
public class DetailsofEmployee {  
	public static void main(String[] args) {
	Employee Sanjaya=new Employee();
	Sanjaya.Employeename="Sanjaya";
	Sanjaya.Salary=15000;
	Sanjaya.Place="Bangalore";
	Sanjaya.Company="BSNL";
	System.out.println("Employeename:"+Sanjaya.Employeename);
	System.out.println("Salary:" +Sanjaya.Salary);
	System.out.println("Place:" +Sanjaya.Place);
	System.out.println("Company:" +Sanjaya.Company);
	System.out.println("++++++");
	Department HR= new Department();
	HR.Departmentname="HR";
	HR.Empcount=75;
	HR.Company= "TATA";
	HR.Salary= 2500;
	System.out.println("Departmentname:"+HR.Departmentname);
	System.out.println("Empcount:"+HR.Empcount);
	System.out.println("Company:"+HR.Company);
	System.out.println("Salary:"+HR.Salary);
	System.out.println("+++++++");
	Insurance Bajaj= new Insurance();
	Bajaj.Insurancename="Bajaj";
	Bajaj.Premium=1900;
	Bajaj.City="Mysore";
	Bajaj.Users=2500;
	System.out.println("Insurancename:"+Bajaj.Insurancename);
	System.out.println("Premium:"+Bajaj.Premium);
	System.out.println("City:"+Bajaj.City);
	System.out.println("Users:"+Bajaj.Users);
		
	}

}

//Santiago Fleiderman
//CSc 2010, Principles of Computer Science
//Spring 2014
//Assignment 3; payroll.java
// A salary computation
//02-22-2014

// Employee's name Walter White
//Number hours work 30 hours a week
//Hourly rate 7 dollars an hour
//Federal tax rate 15%
//Gross pay weekly 210
// tax deducted 31
// Net pay 179
import java.util.Scanner;
public class payroll {

	public static void main(String[] args) {
		Scanner reader = new Scanner( System.in );
		//inputs
		String employeename="Walter White";
		double hoursworked=30;
		double hourlyrate=7;
		double fedtaxrate=.15;
		//calculated from inputs
		double grosspay;
		double netpay;
		double taxdeducted;
		
		//get inputs
		System.out.print( "Enter your Employee Name: " ); employeename = reader.nextLine();
		System.out.print( "What is your Hours Worked: " ); hoursworked = reader.nextDouble();
		System.out.print( "What is your Hourly Rate: "); hourlyrate = reader.nextDouble();
		System.out.print( "Enter your Federal Tax Rate: "); fedtaxrate = reader.nextDouble();
		
		//calculations
		grosspay = hoursworked * hourlyrate;
		taxdeducted = fedtaxrate * grosspay; 
		netpay = grosspay - taxdeducted;
		
		//output
		System.out.println();
		System.out.println( "Employee Name: "+employeename );
		System.out.println( " Hours Worked: "+hoursworked );
		System.out.println( "  Hourly Rate: "+hourlyrate );
		System.out.println( "    Gross Pay: "+grosspay );
		System.out.println( " Tax Deducted: "+taxdeducted);
		System.out.println( "      Net Pay: "+netpay);
		
		
	
		reader.close();
	}

}

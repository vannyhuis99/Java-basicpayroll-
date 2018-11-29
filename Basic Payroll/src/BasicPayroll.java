/*
 * This program calculates a paycheck amount
 * Luke Van Nyhuis 11/27/2018
 */
import java.text.*;
import java.util.*;

public class BasicPayroll {

	

		//declare variables
		static String iString; //generic input string
		static String iFirstName, iLastName;	//first and last name
		static int cHours;	//hours after conversion
		static double cRate;	//rate after conversion
		static double cPay;		//calculated pay
		static String oPay;		//pay after formatting the currency display
		static Scanner myScanner;	//input device
		static NumberFormat nf;		//used to format currency
		
		public static void main(String[] args) {
			
			//call init()
			init();
			
			//call input()
			input();
			
			//call calcs()
			calcs();
			
			//call output()
			output();
			
			
			System.out.println("Program ending, have a good one!");
		}
				
		
		public static void init() {
			//set scanner to the Console
			myScanner = new Scanner (System.in);
			//change delimiter from blank space to Enter key
			myScanner.useDelimiter(System.getProperty("line.separator"));
			
			//set formatter to use U.S. currency format
			nf = NumberFormat.getCurrencyInstance(java.util.Locale.US);
			
		}

		public static void input()	{
			//prompt for first name
			System.out.print("Enter first name: ");
			iFirstName = myScanner.next();
					
			//prompt for last name
			System.out.print("Enter last name: ");
			iLastName = myScanner.next();
			
			
			
			try {
			
			//prompt input and convert hours
			System.out.print("Enter hours: ");
			iString = myScanner.next();
			cHours = Integer.parseInt(iString);
			}
			catch (Exception e) {
				System.out.println("Hours must be a whole number, defaulted to 0");
				cHours = 0;
			
			}
			try {
			//prompt input and convert rate
			System.out.print("Enter rate: ");
			iString = myScanner.next();
			cRate = Double.parseDouble(iString);
			
		}
			catch (Exception e) {
				System.out.println("Rate must be a decimal number, defaulted to 0");
				cRate = 0;
				}
			
		}
			
		public static void calcs()	{

			//calculate pay
			cPay = cHours * cRate;
		}

		private static void output() {
			//display name as last, first
			System.out.println("Name: " + iLastName + ", " + iFirstName);
			//format and output pay
			oPay = nf.format(cPay);
			System.out.println("Pay is: " + oPay);
			
		}
}
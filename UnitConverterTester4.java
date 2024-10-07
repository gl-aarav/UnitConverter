
	/*This program works with UnitConverter3. It will create an instance of
	 * UnitConverter3 and call all of the methods in that class.
	 */
	 
	 import java.util.Scanner;
	 
	 public class UnitConverterTester4
	 {
		 
		private int inches; // declare field vars-these can be used in all methods
		
		public UnitConverterTester4()	  // Constructor - used to initialize field variables.
		{
			inches = -1;
		}
		
		public static void main (String [] args)	// main () method header
		{
			UnitConverterTester4 uct4 = new UnitConverterTester4();	
			
			uct4.convertIt();
		}
		
		public void convertIt()
		{				
			UnitConverter4 uc4 = new UnitConverter4();
			double feet = -1.2;	
			double cm = -2.0;
			double yards = -3.0;
			getInches();
			feet = uc4.inchesToFeet (inches);  // call method
			cm = uc4.inchesToCm (inches);
			yards = uc4.feetToYards(feet);		// call method, parameter = feet
			print(feet, cm, yards);
		}
		
			public void getInches ()
		{
			Scanner keyboard = new Scanner (System.in);	// instantiate Scanner 
			System.out.println ("\n\n\n");
			System.out.println("Welcome to Unit Converter! This program will take in " +
				"the in the number of inches and print the number of feet, yards and " +
				"centimeters.\n");
			System.out.print ("Enter an integer greater than or equal to 0 for the " 
				+ "number of inches --> ");	 // print prompt
			inches = keyboard.nextInt();		// read inches
		}
		
		public void print(double ftIn, double cmIn, double ydsIn)
		{
			System.out.printf ("%n%,d inches is equivalent to %,.2f feet, %,.2f yards" +
				" and %,.2f centimeters.\n", inches, ftIn, ydsIn, cmIn);
			System.out.println ("\n\n\n");
		}
		
		
	}
	

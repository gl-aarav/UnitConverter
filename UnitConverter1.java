
	import java.util.Scanner;	// import Scanner
	
	public class UnitConverter1   // class header
	{
		private static int inches; // declare field vars-these can be used in all methods
		
		public UnitConverter1()	  // Constructor - used to initialize field variables.
		{
			inches = -1;
		}
	
		// prompts the user for the number of inches and reads it in.
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
		
		// calculates number of feet using the field variable inches and returns 
		// the # of ft
		public double inchesToFeet ()
		{
			final byte IN_TO_FT = 12;
			double ft = -1.2;	
			ft = (double)inches/IN_TO_FT;	// calculate feet = inches/12.0
			return ft;	
		}
		
		// calculates number of centimeters using the field variable inches then 
		// returns the cm
		public double inchesToCm ()
		{
			final double IN_TO_CM = 2.54;
			double centi = -5.0;
			centi = inches*IN_TO_CM;		
			return centi;
		}
		
		// takes feet as a parameter then convert it to yards and returns the # of yds
		public double feetToYards (double ft2)
		{												
			final byte FT_YD = 3;	
			double yds = -5.0;
			yds = ft2/FT_YD;		// calculate number of yards
			return yds;			// return the number of yards
		}
		
		// Takes in parameters for feet, yards and cm the prints the # of inches in 
		// each unit
		public void print(double ftIn, double cmIn, double ydsIn)
		{
			System.out.printf ("%n%,d inches is equivalent to %,.2f feet, %,.2f yards" +
				" and %,.2f centimeters.\n", inches, ftIn, ydsIn, cmIn);
			System.out.println ("\n\n\n");
		}
	}
	

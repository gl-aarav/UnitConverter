
	
	import java.util.Scanner;	// import Scanner
	
	public class UnitConverter4   // class header
	{	
		public UnitConverter4()
		{
			
		} 
	
		// prompts the user for the number of inches and reads it in.
	
		
		// calculates number of feet using the field variable inches and returns 
		// the # of ft
		public double inchesToFeet (double inches)
		{
			final byte IN_TO_FT = 12;
			double ft = -1.2;	
			ft = (double)inches/IN_TO_FT;	// calculate feet = inches/12.0
			return ft;	
		}
		
		// calculates number of centimeters using the field variable inches then 
		// returns the cm
		public double inchesToCm (double inches)
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
		
	}
	

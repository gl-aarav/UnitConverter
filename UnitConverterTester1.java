	/*This program works with UnitConverter1. It will create an instance of
	 * UnitConverter and call all of the methods in that class.
	 */
	 public class UnitConverterTester1
	 {
		 public static void main (String [] args)	// main () method header
		{				
			double feet = -1.2;	
			double cm = -2.0;
			double yards = -3.0;
			UnitConverter1 uc1 = new UnitConverter1();
			uc1.getInches();
			feet = uc1.inchesToFeet ();  // call method
			cm = uc1.inchesToCm ();
			yards = uc1.feetToYards(feet);		// call method, parameter = feet
			uc1.print(feet, cm, yards);
		}
	}
	

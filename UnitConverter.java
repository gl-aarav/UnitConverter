/*
* Aarav Goyal
* 9/30/2024
* UnitConverter.java
*/
import java.util.Scanner;
public class UnitConverter{
	static double inches = -1;
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("\n\n\nWelcome to Unit Converter! " +
				"This program will take in the number of inches and \n"+	
				"print the number of feet, yards and centimeters.\n\n" +
				"Please	enter the number of inches: ");
		inches = in.nextDouble();
		double feet = CalcFeet(inches);
		double yards = CalcYards(inches);
		double centimeters = CalcCentimeters(inches);
		print(inches,feet,yards,centimeters);
	}
	public static double CalcFeet(double inches)
	{
		final double FEET_CONVERSION = (double)1/12;
		return inches * FEET_CONVERSION;
	}
	public static double CalcYards(double inches)
	{
		final double YARDS_CONVERSION = (double)1/36;
		return inches * YARDS_CONVERSION;
	}
	public static double CalcCentimeters(double inches)
	{
		final double CENTIMETERS_CONVERSION = 2.54;
		return inches * CENTIMETERS_CONVERSION;
	}	
	public static void print(double inches, double feet, double yards, double centimeters)
	{
		System.out.printf("\n%.2f inches is equivalent to %.2f feet, %.2f yards, and %.2f centimeters.\n\n\n\n", inches, feet, yards, centimeters);	
	}		
}



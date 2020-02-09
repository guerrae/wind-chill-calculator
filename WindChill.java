import java.util.Scanner;
public class WindChill
{
	public static void main(String[] args)
	{
		System.out.println("This program computes the wind-chill");
		System.out.println("Based on Temperature and Wind Speed");
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the temperature in Fahrenheit: ");
		double temperature = keyboard.nextDouble();
		System.out.print("Enter the wind speed in miles per hour: ");
		double windSpeed = keyboard.nextDouble();
		
		final double CONSTANT1 = 34.74,
			     CONSTANT2 = 0.6215,
			     CONSTANT3 = 35.75,
			     CONSTANT4 = 0.4275,
			     EXPONENET = 0.16;
					 
		double powerTerm = Math.pow(windSpeed, EXPONENET);
		double windChillTemperature = CONSTANT1 + CONSTANT2 * temperature 
					    - CONSTANT3 * powerTerm + CONSTANT4 
					    * temperature * powerTerm;
		
		System.out.println("\nThe Temperature is " + temperature + " degrees Fahrenheit.");
		System.out.println("The wind speed is " + windSpeed + " m.p.h.");
		System.out.println("The Wind-Chill Temperature is " + Math.round(windChillTemperature) + " degrees Fahrenheit");
		
	}//end main
}//end WindChill
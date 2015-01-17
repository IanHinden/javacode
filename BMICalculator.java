import java.util.Scanner;

public class BMICalculator
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		double f, i, lbs, m, kg, bmi;
		
		System.out.print( "Your height in feet: " );
		f = keyboard.nextDouble();
		
		System.out.print( "Now add those inches: " );
		i = keyboard.nextDouble();
		
		System.out.print( "Your weight in lbs: " );
		lbs = keyboard.nextDouble();
		
		i = (f * 12) + i;
		m = 0.0254 * i;
		kg = lbs * 0.453592;
		bmi = kg / (m*m);
		
		System.out.println( "Your BMI is " + bmi );
	}
}
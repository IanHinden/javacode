import java.util.Scanner;

public class BMICategories
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		double feet, inches, heightininches, weight, bmi;
		
		System.out.print( "Enter your height in feet: ");
		feet = keyboard.nextDouble();
		
		System.out.print( "And the remaining inches: ");
		inches = keyboard.nextDouble();
		
		System.out.print( "What is your weight?: ");
		weight = keyboard.nextDouble();
		
		heightininches = (12 * feet) + inches;
		bmi = (weight / (heightininches * heightininches)) * 703;
		
		System.out.print( "BMI category: " );
		if (bmi < 15.0 )
		{
			System.out.println( "very severely underweight" );
		}
		else if ( bmi <=16 )
		{
			System.out.println( "severely underweight" );
		}
		else if ( bmi < 18.5 )
		{ 
			System.out.println( "underweight" );
		}
		else if ( bmi < 25.0 )
		{
			System.out.println( "normal weight" );
		}
		else if ( bmi < 30.0 )
		{
			System.out.println( "overweight" );
		}
		else if ( bmi < 35.0 )
		{
			System.out.println( "moderately obese" );
		}
		else if ( bmi < 40.0 )
		{
			System.out.println( "severely obese" );
		}
		else
		{
			System.out.println( "very severly/\"morbidly\" obese" );
		}
	}
}